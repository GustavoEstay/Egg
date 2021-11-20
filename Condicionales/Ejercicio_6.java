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
 * Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2,mayor;
        mayor=0;
        System.out.println("Ingrese un número");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2=leer.nextInt();
        if (num1>num2) {
            mayor=num1;
        } else { 
            mayor=num2;
        }
        System.out.println("El número mayor es " + mayor);
        
    }
    
}
