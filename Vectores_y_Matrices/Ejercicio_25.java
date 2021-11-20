/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores_y_Matrices;

import java.util.Scanner;

/**
 *
 * @author Gustavo Realizar un programa que rellene un matriz de 4 x 4 de
 * valores aleatorios y muestre traspuesta.
 */
public class Ejercicio_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz;
        String aux;
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        matriz = new int[4][4];
        System.out.println("Matriz: ");
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                matriz[i][j] = (int) (Math.random() * 50);
                System.out.print("[" + matriz[i][j] + "], ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print("[" + matriz[j][i] + "], ");
            }
            System.out.println(" ");
        }
    }
}
