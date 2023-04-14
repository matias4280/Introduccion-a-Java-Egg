/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.java;

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
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese un valor limite positivo");
       int limite = leer.nextInt();
       int suma = 0;
       while(suma<=limite){
           System.out.println("Ingrese un numero");
           int numero = leer.nextInt();
           suma = suma + numero;
       }
        System.out.println("La variable suma: "+suma+" sobrepasó el limite: "+limite);
    }
    
}
