/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import Entidades.Puntos;

/**
 *
 * @author Matias
 */
public class ejercicio2_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos punto = new Puntos();
        punto.crearPuntos();
        System.out.println("La distancia entre los dos puntos es: " + punto.calcularDistancia());
    }
    
}
