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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 1 numero");
        int numero = leer.nextInt();
        int doble = numero * 2;
        int triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("El doble de "+numero+" es: "+doble);
        System.out.println("El triple de "+numero+" es: "+triple);
        System.out.println("La raiz cuadrada de "+numero+" es: "+raizCuadrada);
    }
    
}
