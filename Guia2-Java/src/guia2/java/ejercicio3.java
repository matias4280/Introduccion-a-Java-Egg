/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.java;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresá una frase ");
        String frase = leer.nextLine();
        System.out.println("Tu frase en mayusculas es: "+frase.toUpperCase());
        System.out.println("Tu frase en minusculas es: "+frase.toLowerCase());
    }
    
}
