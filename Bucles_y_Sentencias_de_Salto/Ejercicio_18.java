/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_y_Sentencias_de_Salto;

import java.util.Scanner;

/**
 *
 * @author Gustavo Dibujar un cuadrado de N elementos por lado utilizando el
 * carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos.
 */
public class Ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, i, j;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el numero de lados que desea del cuadrado");
        num = leer.nextInt();
        for (i = 0; i < num; i++) {
            for (j = 0; j < num; j++) {
                if (i == 0 || i == num - 1) {
                    System.out.print("*");
                }
                if (i > 0 && i < num - 1) {
                    if (j == 0 || j == num - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}
