/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_y_Sentencias_de_Salto;

import java.util.Scanner;

/**
 *
 * @author Gustavo Escriba un programa que lea 20 números. Si el número leído es
 * igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el
 * numero cero". El programa deberá calcular y mostrar el resultado de la suma
 * de los números leídos, pero si el número es negativo no debe sumarse. Nota:
 * recordar el uso de la sentencia break.
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        double suma;        
        suma = 0;
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        for (int i = 0; i <= 20; i++) {
                System.out.println("Ingrese un número");
                num1 = leer.nextInt();
                if (num1 > 0) {
                    suma = suma + num1;
                } else if (num1 == 0) {
                    System.out.println("Se capturó el numero cero");
                    break;
                }
        }
        System.out.println("La suma de los números ingresados es " + suma);
    }
}
