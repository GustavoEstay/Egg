
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo Escribir un programa que lea un número entero por teclado y
 * muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
 * Nota: investigar la función Math.sqrt().
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        double doble, triple, raiz_cuadrada;
        System.out.println("Ingrese el número que desea procesar");
        num = leer.nextInt();
        doble = 2 * num;
        triple = 3 * num;
        raiz_cuadrada = Math.sqrt(num);
        System.out.println("El doble del número ingresado es " + doble);
        System.out.println("El triple del número ingresado es " + triple);
        System.out.println("La raíz cuadrada del número ingresado es " + raiz_cuadrada);
    }

}
