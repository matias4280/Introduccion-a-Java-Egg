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
public class ej6_extra {

    /**
     * @param args the command line arguments
     * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
     * y el promedio de estaturas en general.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que va a procesar");
        int N = leer.nextInt();
        double sumaEstaturas = 0;
        double sumaEstaturas1_60 = 0;
        int contador1 = 0;
        int contador2 = 0;
        for(int i=1;i<=N;i++){
            System.out.println("Ingrese la estatura de la persona");
            double estatura = leer.nextDouble();
            if(estatura<1.60){
                sumaEstaturas1_60 = sumaEstaturas1_60 + estatura;
                contador1++;
            }
            sumaEstaturas = sumaEstaturas + estatura;
            contador2++;
            
        }
        System.out.println("El promedio de estaturas menores a 1,60 es: "+(sumaEstaturas1_60/contador1));
        System.out.println("El promedio de estaturas en general es : "+(sumaEstaturas/contador2));
        //puede haber un error en la interpretación del enunciado. 
    }
    
}
