/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores_y_Matrices;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gustavo Realice un programa que compruebe si una matriz dada es anti
 * simétrica. Se dice que una matriz A es anti simétrica cuando ésta es igual a
 * su propia traspuesta, pero cambiada de signo.
 */
public class Ejercicio_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz, matrizT;
        boolean antisim;
        matriz = new int[4][4];
        matrizT = new int[4][4];
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        System.out.println("Matriz: ");
        System.out.println("Ingrese los valores de la matriz ");

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }

        mostrarMatriz(matriz);
        matrizTranspuesta(matriz, matrizT);
        antisim = comparaMatriz(matriz, matrizT);
        
        if (antisim = true) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }

    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz ingresada");
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print("[" + matriz[i][j] + "], ");
            }
            System.out.println(" ");
        }
    }

    public static void matrizTranspuesta(int[][] matriz, int[][] matrizT) {
        System.out.println("Matriz Transpuesta");
        for (int b = 0; b <= 3; b++) {
            for (int j = 0; j <= 3; j++) {
                matrizT[b][j] = matriz[j][b];
                System.out.print("[" + matrizT[b][j] + "], ");
            }
            System.out.println(" ");
        }
    }

    public static boolean comparaMatriz(int[][] matriz, int[][] matrizT) {
        if (Arrays.deepEquals(matriz, matrizT)) {
            return true;
        } else {
            return false;
        }
    }
    }
