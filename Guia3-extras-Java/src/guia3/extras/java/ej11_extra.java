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
public class ej11_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int cantidad=0;
        System.out.println("Ingrese un numero para calcular cuantas cifras tiene");
        int numero = leer.nextInt();
        
        while(numero > 0){
         cantidad=cantidad+1;
         numero = numero / 10;
        }
        System.out.println("La cantidad de cifras del numero ingresado es: "+cantidad);
    }
    
}
