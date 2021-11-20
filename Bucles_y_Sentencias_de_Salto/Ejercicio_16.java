/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_y_Sentencias_de_Salto;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Gustavo Realizar un programa que simule el funcionamiento de un
 * dispositivo RS232. 1) Comprobar largo de 5 caracteres. 2) Que empiece con X y
 * termine con O. 3) Que cuente cuando es correcto y cuando no. 4) Que salga con
 * &&&&&. 5) Que cuando salga diga cuantas correctas y cuantas incorrectas
 * habían.
 */
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String codigo;
        int i, j;
        i = 0;
        j = 0;
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        do {
            System.out.println("Ingrese un código de 5 dígitos que comience con X y finalice con O. ");
            codigo = leer.next();
            codigo = toUpperCase(codigo);
            if (codigo.length() == 5 && 
                    codigo.charAt(0) == 'X' && 
                        codigo.charAt(4) == 'O') {
                        i = (i + 1);
                    } else {
                        j = (j + 1);
                    }
        } while (!"&&&&&".equals(codigo));
        System.out.println("Los códigos ingresados correctamente fueron " + i);
        System.out.println("Los códigos ingresados incorrectos fueron " + j);
        System.out.println("Muchas gracias.");
    }
}
