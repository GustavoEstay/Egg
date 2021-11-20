package Condicionales;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 * Crear un programa que dado un numero determine si es par o impar.
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un número");
        num1 = leer.nextInt();
        if (num1%2==0) {
            System.out.println("El número es par ");
        } else { 
            System.out.println("El número es impar");
        }
        
    }
}