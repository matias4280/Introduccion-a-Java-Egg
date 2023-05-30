/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.ejercicio5;

import Servicio.PaisServicio;

/**
 *
 * @author Matias
 */
public class Guia10Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicio ps = new PaisServicio();
        ps.crearPaises();
        ps.mostrarPaises();
        ps.mostrarPaisesOrdenado();
        ps.borrarPais();
    }
    
}
