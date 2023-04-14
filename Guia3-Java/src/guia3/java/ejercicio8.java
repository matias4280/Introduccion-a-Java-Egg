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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos por Lado del cuadrado");
        int lados = leer.nextInt();
        
        for(int i=1; i<=lados; i++){
            for(int j=1; j<=lados; j++){
                if(j==1 || j==lados || i==1 || i==lados){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
              
            }
              System.out.println();
        }
    }
    
}
