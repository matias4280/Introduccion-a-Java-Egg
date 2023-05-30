/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.java;

import Servicios.AlumnoServicio;

/**
 *
 * @author Matias
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoServicio as = new AlumnoServicio();
        as.crearAlumnos();
        as.mostrarAlumnos();
        System.out.println("La nota final del alumno es: "+as.NotaFinal());
        
    }
    
}
