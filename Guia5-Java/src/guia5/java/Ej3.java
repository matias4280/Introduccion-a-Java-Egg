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
public class Ej3 {
    /**Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
    */
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector ");
        int N = leer.nextInt();
        
        int[] aleatorios = new int[N];
        int[] digitos = new int[5];
        
        for(int i = 0; i<aleatorios.length;i++){
            System.out.println("Ingrese un valor para el vector");
            aleatorios[i]= leer.nextInt();
        }   
        
        mostrarVector(aleatorios);
        
        for(int i = 0; i<aleatorios.length;i++){
              int cantDigitos = cifras(aleatorios[i]);
              digitos[cantDigitos-1]++; //el -1 es porque el vector empieza en 0 y las cifras en 1
        }
        
        for(int i = 0; i<digitos.length;i++){
              
              System.out.println("Hay "+digitos[i]+" numeros de "+(i+1)+" cifras"); //el i+1 es porque en la posicion 0 tengo la cantidad de nros de 1 digito, etc
        }
        
        
    
    }
    
    public static int cifras(int numero){
        int cantCifras = 0;
        while(numero>0){
            cantCifras++;
            numero = numero / 10;
        }
        return cantCifras;
    }
    public static void mostrarVector(int[] vector){
         for(int i = 0; i<vector.length;i++){
            System.out.print("["+vector[i]+"]");   
        }
        System.out.println("");
    }
    
}
