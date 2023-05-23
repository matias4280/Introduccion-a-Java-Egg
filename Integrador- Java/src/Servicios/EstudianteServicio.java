/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class EstudianteServicio {
    
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Estudiante crearEstudiante(){
        
        Estudiante est = new Estudiante();

        System.out.println("Ingrese el nombre del alumno");
        est.setNombre(leer.next());
        System.out.println("Ingrese la nota final");
        est.setNota(leer.nextDouble());
        
        return est;
    }
    
    public Estudiante crearEstudiante(String nombre, double nota){
        
        Estudiante est = new Estudiante(nombre,nota);
        return est;
    }
    
   
}
