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
 * Considera que estás desarrollando una web para una empresa que fabrica motores
(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tipoMotor;
        System.out.println("Ingrese el tipo de motor (1 a 4)");
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        tipoMotor = leer.nextInt();
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                 System.out.println("La bomba es una bomba de gasolina");
                 break;
            case 3:
                 System.out.println("La bomba es una bomba de hormigón");
                 break;
            case 4:
                 System.out.println("La bomba es una bomba de pasta alimenticia");
                 break;
             default:
                 System.out.println("No existe un valor válido para tipo de bomba");
                 break;
        }
    }
    
}
