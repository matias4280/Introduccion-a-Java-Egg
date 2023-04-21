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
public class Ej5 {
    /**
    * Realice un programa que compruebe si una matriz dada es antisimétrica. Se
    * dice que una matriz A es antisimétrica cuando ésta es igual a su propia
    * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
    * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
    * sus filas por columnas (o viceversa).
 */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        int[][] traspuesta = new int[4][4];
        
        for (int i = 0; i<4; i++){
            for(int j=0; j<4; j++){
                matriz[i][j]=(int)(Math.random()*(10-(-10)+1)+(-10));
            }
         }
        mostrarMatriz(matriz);
        
        generarTraspuesta(matriz,traspuesta);
        
        mostrarMatriz(traspuesta);
        
        int contador=0;
        for (int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(matriz[i][j] == (-1)*(traspuesta[i][j])){
                    contador++;
                }
                 
            }
         }
        System.out.println(contador);
        if(contador==16){   
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }

    }

    public static void mostrarMatriz(int[][] matriz) {
       for (int i = 0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
         }
        System.out.println("");
    }
    
    public static void generarTraspuesta(int[][]matriz,int[][]traspuesta){
        for (int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                  traspuesta[i][j] = matriz[j][i];
            }
         }
    }
    
    
}
