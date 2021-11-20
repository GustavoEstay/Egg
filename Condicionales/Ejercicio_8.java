/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        System.out.println("Escriba una frase ");
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        frase = leer.next();
         if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else { 
            System.out.println("Incorrecto");
        }
    }
    
}
