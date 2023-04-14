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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese un numero para verificar si es par o impar");
      int numero = leer.nextInt();
      if(numero%2 == 0){
          System.out.println("El numero es par");
      }else{
          System.out.println("El numero es impar");
      }
      
    }
    
}
