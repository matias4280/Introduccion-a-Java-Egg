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
public class ej14_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese la cantidad de Familias");
       int cantFamilias = leer.nextInt();
       int cantHijos;
       
      
       for(int i=1; i<=cantFamilias;i++){
           System.out.println("Ingrese la cantidad de hijos de la familia "+i);
           cantHijos = leer.nextInt();      
           System.out.println();
       }
    }
}
