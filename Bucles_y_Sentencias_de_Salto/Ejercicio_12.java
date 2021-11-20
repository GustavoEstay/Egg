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
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int nota;
     System.out.println("Ingrese su nota (0 a 10)");
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        nota = leer.nextInt();
     do {
         if (nota>10) {
             System.out.println("La nota ingresada no es válida.");
             System.out.println("Ingrésela nuevamente.");
             nota = leer.nextInt();
         }
         } while(nota>10);
     if (nota<10) {
             System.out.println("Su nota es de "+nota+" puntos");
     }
     }
}
