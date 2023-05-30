/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.java;

import Servicios.PeliculaServicio;

/**
 *
 * @author Matias
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PeliculaServicio ps = new PeliculaServicio();
       ps.crearPeliculas();
       ps.mostrarPeliculas();
       System.out.println("");
       System.out.println("PELICULAS MAYOR A 1 HORA");
       System.out.println("");
       ps.mostrarPeliculasMayorA1Hora();
       System.out.println("");
       System.out.println("PELICULAS DE MAYOR A MENOR DURACION");
       System.out.println("");
       ps.ordenarDuracionMayorAMenor();
       System.out.println("");
       System.out.println("PELICULAS MENOR A MAYOR A DURACION");
       System.out.println("");
       ps.ordenarDuracionMenorAMayor();
       System.out.println("");
       System.out.println("PELICULAS ORDENADAS POR TITULO ALFABETICAMENTE"); 
       System.out.println("");
       ps.ordenarPorTitulo();
       System.out.println("");
       System.out.println("PELICULAS ORDENADAS POR DIRECTOR ALFABETICAMENTE");
       System.out.println("");
       ps.ordenarPorDirector();
       System.out.println("");
    }
    
}
