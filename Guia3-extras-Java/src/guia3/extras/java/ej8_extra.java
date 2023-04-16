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
public class ej8_extra {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int ingresados=0;
        int pares = 0;
        int impares = 0;
        
        while(true){
            System.out.println("Ingrese un numero");
            int numero = leer.nextInt();
            
            if(numero % 2 == 0 ){
                pares++;
            }else{
                impares++;
            }
            ingresados++;
            if(numero % 5 == 0){
                break;
            }
        }
        System.out.println("La cantidad de numeros pares ingresados es: "+pares);
        System.out.println("La cantidad de numeros impares ingresados es: "+impares);
        System.out.println("La cantidad de numeros ingresados en total es: "+ingresados);
    }
    
}
