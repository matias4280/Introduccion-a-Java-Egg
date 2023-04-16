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
public class ej9_extra {

    /**
     * @param args the command line arguments
     * 
     * Simular la división usando solamente restas. 
     * Dados dos números enteros mayores que uno, 
     * realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
     * Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
     * este resultado es el residuo, y el número de restas realizadas es el cociente.
        Por ejemplo: 50 / 13:
        50 – 13 = 37     una resta realizada
        37 – 13 = 24     dos restas realizadas
        24 – 13 = 11     tres restas realizadas
        * 
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros mayores que uno ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("La division será num1/num2 ");
        int cantidadRestas = 0;
        int resta;
        do{
          resta = num1 - num2;  
          num1 = resta;
          cantidadRestas++;
        }while(resta>=num2);
        
        System.out.println("El resultado de la disivion es "+cantidadRestas+" y el residuo es "+resta);
    }
    
}
