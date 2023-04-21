/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Ej2 {
/**Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector ");
        int N = leer.nextInt();
        
        int[] aleatorios = new int[N];
        
        for(int i = 0; i<aleatorios.length;i++){
            aleatorios[i]= (int)(Math.random()*10);
        }
        
        System.out.println("El vector está lleno ");
        
        for(int i = 0; i<aleatorios.length;i++){
            System.out.print("["+aleatorios[i]+"]");
            
        }
        System.out.println("");
        
        System.out.println("Ingrese un valor para buscar en el vector ");
        int numero = leer.nextInt();
        int contador = 0;
        for(int i = 0; i<aleatorios.length;i++){
            if(numero == aleatorios[i]){
                contador++;   
                System.out.println("El numero se encuentra en la posicion "+i);   
        }
        }
        if(contador>1){
            System.out.println("El numero se encuentra repetido "+contador+" veces");
        }
    }
    
}
