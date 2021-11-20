
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        System.out.println("Ingrese su nombre ");
        Scanner leer = new Scanner(System.in);
        nombre=leer.next();
        System.out.println("Hola! "+nombre+" bienvenidx a Java! ");
                
    }
    
}
