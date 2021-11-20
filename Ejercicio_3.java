
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo
 * Escribir un programa que pida una frase y la muestre toda en
 * mayúsculas y después toda en minúsculas. Nota: investigar la función
 * toUpperCase() y toLowerCase() en Java.
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase, mayuscula, minuscula;
        System.out.println("Escriba una frase ");
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        frase = leer.next();
        mayuscula = toUpperCase(frase);
        System.out.println(mayuscula);
        minuscula = toLowerCase(frase);
        System.out.println(minuscula);
    }

}
