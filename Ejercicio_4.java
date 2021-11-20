
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double Fahrenheit,celsius;
        System.out.println("Ingrese la temperatura actual en grados Celsius");
        celsius=leer.nextInt();
        Fahrenheit=(32+(9 * celsius / 5));
        System.out.println("La temperatura en Grados Fahrenheit es de "+Fahrenheit+" grados");
    }
    
}
