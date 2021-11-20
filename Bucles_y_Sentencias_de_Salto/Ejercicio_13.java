/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_y_Sentencias_de_Salto;

import java.util.Scanner;

/**
 *
 * @author Gustavo Escriba un programa en el cual se ingrese un valor límite
 * positivo, y a continuación solicite números al usuario hasta que la suma de
 * los números introducidos supere el límite inicial.
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int limite, num1, num2, num3, suma;
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        System.out.println("Ingrese el valor límite que desea");
        limite = leer.nextInt();
        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();
        suma = num1 + num2;
        do {
            if (suma < limite) {
                System.out.println("El límite no ha sido alcanzado. Ingrese otro número");
                num3 = leer.nextInt();
                suma = suma + num3;
            }
        } while (suma < limite);
        System.out.println("La suma de los números ingresados es igual o superior al límite");
        System.out.println("Muchas Gracias.");
    }
}
