/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.java;

import Entidades.Libro;

/**
 *
 * @author Matias
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Libro libro = new Libro();
       libro.cargarLibro();
       libro.mostrarLibro();
    }
    
}
