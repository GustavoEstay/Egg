/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores_y_Matrices;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gustavo Realizar un algoritmo que rellene un vector de tamaño N con
 * valores aleatorios y le pida al usuario un numero a buscar en el vector. El
 * programa mostrará donde se encuentra el numero y si se encuentra repetido.
 */
public class Ejercicio_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,j, buscar;
        int[] vector;
        j=0;
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        vector = new int[n];
        for (int i = 0; i <= n-1; i++) {
             vector[i]=(int)(Math.random()*50);
             System.out.println("arreglo "+i+" ------> "+vector[i]);
        }
        System.out.println("Ingrese el valor que desea buscar");
        buscar = leer.nextInt();
        for (int i = 0; i <= n-1; i++) {
            if (vector[i] == buscar) {
                System.out.println("La posición del valor ingresado es [" + i + "] ");
                j=j+1;
            } else if (vector [i]!= buscar &&
                    i == n-1 &&
                    j==0) {
                System.out.println("El valor ingresado no se encuentra en el arreglo");
            }
        }
        if (j>1) {
        System.out.println("El valor ingresado se encuentra repetido "+j+" veces");
    }
    }

}
