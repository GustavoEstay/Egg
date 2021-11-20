/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores_y_Matrices;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;
import java.util.Arrays;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.length;

/**
 *
 * @author Gustavo Recorrer un vector de N enteros contabilizando cuántos
 * números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, a, b, c, d, e;
        int[] vector;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        String aux;
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        vector = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            vector[i] = (int) (Math.random() * 99999);
            aux = String.valueOf(vector[i]);
            if (aux.length() == 1) {
                a = a + 1;
            } else if (aux.length() == 2) {
                b = b + 1;
            } else if (aux.length() == 3) {
                c = c + 1;
            } else if (aux.length() == 4) {
                d = d + 1;
            } else if (aux.length() == 5) {
                e = e + 1;
            }
        }
        System.out.println("Los números con un dígito son " + a);
        System.out.println("Los números con dos dígitos son " + b);
        System.out.println("Los números con tres dígitos son " + c);
        System.out.println("Los números con cuatro dígitos son " + d);
        System.out.println("Los números con cinco dígitos son " + e);
    }
}
