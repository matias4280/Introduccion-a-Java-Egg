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
public class ej1_extra {

    /**
     * @param args the command line arguments
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
     * Por ejemplo, si el usuario ingresa 1600 minutos, 
     * el sistema debe calcular su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos para convertirlo en formato dias, horas");
        int tiempo = leer.nextInt();
        int minutosPorDia = 24*60;
        int dias = tiempo / minutosPorDia;
        int horas= (tiempo % minutosPorDia)/60; //a los minutos sobrantes lo divido entre 60 para obtener las horas
        System.out.println("El equivalente a "+tiempo+" minutos es: "+dias+" dia, "+horas+" horas");
    }
    
}
