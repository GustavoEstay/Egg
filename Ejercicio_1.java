
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Gustavo
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 * 
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        double suma;
        System.out.println("Ingrese el primer número que desea sumar");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo número que desea sumar");
        num2=leer.nextInt();
        suma=num1+num2;
        System.out.println("La suma de ambos números es "+suma);
        
    }
    
}
