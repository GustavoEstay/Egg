/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Gustavo
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String frase;
        System.out.println("Escriba una palabra o frase que comience con la letra ´A´ ");
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        frase = leer.next();
         if (frase.substring(0,1).equals("A")) {
             System.out.println("CORRECTO");
         } else if (frase.substring(0,1).equals("a")) {
             System.out.println("CORRECTO");
    } else { 
             System.out.println("INCORRECTO");
         }
    }
    
}
