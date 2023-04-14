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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una frase que comience con A o a");
       String frase = leer.nextLine();
       if(frase.substring(0,1).equals("A") || frase.substring(0,1).equals("a")){
           System.out.println("La frase empieza con A, es correcta");          
       }else{
           System.out.println("La frase empieza con "+frase.substring(0, 1)+" , es incorrecta");
       }
    }
}
