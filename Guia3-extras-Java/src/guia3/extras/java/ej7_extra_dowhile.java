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
public class ej7_extra_dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que va a ingresar");
        int N = leer.nextInt();
        int i=1;
        int max = -1;
        int min = 999;
        int suma = 0;
        do{
         System.out.println("Ingrese un numero");
            int numero = leer.nextInt();
            if(numero > max){
                max = numero;
            }
            if(numero < min ){
                min = numero;
            }
            suma = suma + numero;
            i++;
        }while(i<=N);
        
        System.out.println("El maximo numero ingresado es: "+max);
        System.out.println("El minimo numero ingresado es: "+min);
        System.out.println("El promedio de los numeros ingresados es "+(suma/N));
    }
    
}
