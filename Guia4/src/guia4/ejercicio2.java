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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personas();
    }
    public static void personas(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cuantas personas desea ingresar?");
        int N = leer.nextInt();
        leer.nextLine();
        String salir="";
        int i = 1;
        while(i<=N && !(salir.equals("No"))){
            i++;
            System.out.println("Ingrese su nombre");
            String nombre = leer.nextLine();
            System.out.println("Ingrese su edad");
            int edad = leer.nextInt();
            System.out.println("Su nombre es: "+nombre+".");
            if(edad >= 18){
                System.out.print("Su edad es: "+edad+". Usted es mayor de edad ");
            }else{
                if(edad >= 0 && edad < 18){
                System.out.print("Su edad es: "+edad+". Usted es menor de edad ");
                }
            }
            System.out.println();
            System.out.println("Desea seguir mostrando personas?");
            System.out.println("De ser así, ingrese la palabra No");
            leer.nextLine();
            salir = leer.nextLine();
       
        }
     }
    
}
