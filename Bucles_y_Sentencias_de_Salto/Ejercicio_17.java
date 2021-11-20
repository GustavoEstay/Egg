/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_y_Sentencias_de_Salto;

/**
 *
 * @author Gustavo
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E.
 */
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        String numCadena="E";
        for (int i = 0; i <= 999; i++) {
            num = i + 1000;
            numCadena = String.valueOf(num);
            for (int j = 1; j <= 3; j++) {
                if (numCadena.substring(j, j + 1).equals("3")) {
                    System.out.print("E");
                } else {
                    System.out.print(numCadena.substring(j, j + 1));
                }
            }
            System.out.println("");
        }
    }

}
