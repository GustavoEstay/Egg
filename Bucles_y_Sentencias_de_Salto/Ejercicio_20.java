/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_y_Sentencias_de_Salto;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 * Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras.
 */
public class Ejercicio_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double euros, dolar, yenes, libras;
        String moneda;
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        System.out.println("Ingrese la cantidad de euros a convertir");
        euros = leer.nextDouble();
        System.out.println("Ingrese la moneda a la que quiere convertir (dolar, yenes, libras)");
        moneda = leer.next();
        switch (moneda) {
            case "dolar":
                dolar=(euros*1.29);
                System.out.println("Son "+dolar+" u$d");
                break;
            case "yenes":
                yenes=(euros*129.85);
                System.out.println("Son "+yenes+" yenes");
                break;
            case "libras":
                libras=(euros*0.86);
                System.out.println("Son "+libras+" libras");
                break;
            default:
                System.out.println("La moneda ingresada no es válida.");
                System.out.println("Corrobore y vuelva e intentarlo");
                break;
    }   
    }
    
}
