/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.java;

/**
 *
 * @author Matias
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    /*
    Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
    los muestre por pantalla en orden descendente.
    */
    public static void main(String[] args) {
        int[] enteros = new int[101];
       
        for(int i = 0; i<enteros.length;i++){
            enteros[i]=i;
        }
        for(int i = 100; i >= 0 ;i--){
            System.out.println("El numero en la posicion "+"enteros"+"["+i+"]"+"es"+enteros[i]);
        }
    }
    
}
