/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.java;

import Entidades.Rectangulo;

/**
 *
 * @author Matias
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.crearRectangulo();
        System.out.println("La superficie del rectangulo es: "+rectangulo1.superficie());
        System.out.println("El perimetro del rectangulo es: "+rectangulo1.perimetro());
        rectangulo1.dibujarRectangulo();
    }
    
}
