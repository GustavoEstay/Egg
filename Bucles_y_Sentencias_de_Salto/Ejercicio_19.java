/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_y_Sentencias_de_Salto;

import java.util.Scanner;

/**
 *
 * @author Gustavo Realizar un programa que lea 4 números (comprendidos entre 1
 * y 20) e imprima el número ingresado seguido de tantos asteriscos como indique
 * su valor.
 */
public class Ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();
        System.out.println("Ingrese el tercer número");
        num3 = leer.nextInt();
        System.out.println("Ingrese el cuarto número");
        num4 = leer.nextInt();

        System.out.print(num1);
        for (int i = 1; i <= num1; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(num2);
        for (int j = 1; j <= num2; j++) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(num3);
        for (int k = 1; k <= num3; k++) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(num4);
        for (int l = 1; l <= num4; l++) {
            System.out.print("*");
        }
        System.out.println(" ");

    }

}
