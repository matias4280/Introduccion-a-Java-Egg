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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     * 
     */
    /*
    Escribir un programa que pida dos números enteros por teclado y 
    calcule la suma de los dos.
    El programa deberá después mostrar el resultado de la suma
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el siguiente");
        int numero2 = leer.nextInt();
        
        int suma = numero1 + numero2;
        System.out.println("La suma es: "+suma);
        
    }
    
}
