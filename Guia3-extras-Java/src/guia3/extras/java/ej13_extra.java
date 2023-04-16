/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.extras.java;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class ej13_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese la altura de la escalera");
       int numero = leer.nextInt();
       
       //el primer for va a imprimer 9 lineas
       for(int i=1; i<=numero;i++){
           //el segundo for imprime en cada linea la cantidad de numeros necesarios
           for(int j=1;j<=i;j++){
               System.out.print(j);
           }
           System.out.println();
       }
    }
    
}
