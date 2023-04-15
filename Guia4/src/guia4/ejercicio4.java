/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para verificar si es primo o no");
        int numero = leer.nextInt();
        
        if(esPrimo(numero)){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
    public static boolean esPrimo(int numero){
        boolean bandera = true;
        int m = 2;
        while(bandera && m<numero){
            if((numero % m)==0){
                bandera = false;
            }else{
                m=m+1;
            }
        }
        return bandera;
      
    }
    
}
