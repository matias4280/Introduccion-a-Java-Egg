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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresá tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Tu nombre es: "+nombre);
    }
    
}
