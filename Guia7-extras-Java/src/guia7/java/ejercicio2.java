/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.java;

import Entidades.Circunferencia;

/**
 *
 * @author Matias
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia();
        circulo.crearCircunferencia();
        System.out.println("El area de la circunferencia es: "+circulo.area());
        System.out.println("El area de la circunferencia es: "+circulo.perimetro());
    }
    
}
