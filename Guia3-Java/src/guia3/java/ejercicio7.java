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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        String FDE = "&&&&&";
        int correctas = 0;
        int incorrectas = 0;
        String frase= " ";
        do{
           System.out.println("Ingrese una frase para analizarla");
           frase = leer.nextLine();
           String primerLetra = frase.substring(0,1);
           String segundaLetra = frase.substring(3,4);
           if((frase.length()==5) && (primerLetra.equals("x")) && (segundaLetra.equals("o"))){
               correctas = correctas + 1;
           }else{
               incorrectas = incorrectas + 1;
           }
        }while(!FDE.equals(frase));
        
        System.out.println("La cantidad de lecturas correctas fueron: "+correctas);
        System.out.println("La cantidad de lecturas incorrectas fueron: "+(incorrectas-1));
        //le resto 1 para descontar la frase = &&&&&
    }
    
}
