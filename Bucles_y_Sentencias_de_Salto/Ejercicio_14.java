package Bucles_y_Sentencias_de_Salto;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 * Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla un menú
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments     */
    public static void main(String[] args) {
       int num1, num2, opcion;
       double suma, resta, multip, divis;
       String confirmar;
       confirmar="N";
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        System.out.println("Ingrese un número");
        num1 = leer.nextInt();
        System.out.println("Ingrese un segundo número");
        num2 = leer.nextInt();
        do {
            System.out.println("MENÚ");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        System.out.println("5) Salir");
        System.out.println("Elija una opción: ");
        opcion=leer.nextInt();
        switch (opcion) {
            case 1:
                suma=(num1+num2);
                System.out.println("La suma de ambos números es "+suma);
                break;
            case 2:
                resta=(num1-num2);
                 System.out.println("La resta de ambos números es "+resta);
                 break;
            case 3:
                multip=(num1*num2);
                 System.out.println("El producto de ambos números es "+multip);
                 break;
            case 4:
                divis=(num1/num2);
                 System.out.println("El cociente de ambos números es "+divis);
                 break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                confirmar=leer.next();
                confirmar=toUpperCase(confirmar);
                if (confirmar.equals("S")) {
                    System.out.println("Muchas Gracias.");
                }
                break;
             default:
                 if (opcion>5) {
                 System.out.println("El valor ingresado no es válido");
                 }
                 break;
        }
    } while ((opcion==5)&&(confirmar.equals("N")));
        }
        
    
}
