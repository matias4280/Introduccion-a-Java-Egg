/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.java;

import Servicios.RazaServicio;

/**
 *
 * @author Matias
 */
public class ejercicio1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      RazaServicio rs = new RazaServicio();
      rs.crearRazas();
      rs.mostrarRazas();
      rs.eliminarRaza();
    }
    
}
