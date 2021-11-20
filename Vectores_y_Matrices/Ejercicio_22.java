/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores_y_Matrices;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
public class Ejercicio_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] enteros;
        int maximo=100;
        enteros = new int [100];
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        for (int i=0; i<=maximo; i++) {
            enteros[i]=maximo-i;
            System.out.print("["+enteros[i]+"], ");
        }
    }
    
}
