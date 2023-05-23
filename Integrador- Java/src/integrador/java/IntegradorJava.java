/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador.java;

import Entidades.Estudiante;
import Servicios.EstudianteServicio;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class IntegradorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
       EstudianteServicio es = new EstudianteServicio();
       
       Estudiante[] estudiantes = new Estudiante[8];
       
       //Creo a los estudiantes y los pongo en el arreglo
       for(int i = 0; i < estudiantes.length; i++){
          estudiantes[i] = es.crearEstudiante();
       }
       
       //Muestro la informacion de los estudiantes del arreglo
       
       for(int i = 0; i < estudiantes.length; i++){
           System.out.println(estudiantes[i].toString());
           }
       
       //Promedio notas curso
       double promedio_notas_curso;
       double suma_notas_curso = 0;
       int cantidadAlumnos = estudiantes.length;
       int mayor_al_promedio = 0;
       
       for(int i = 0; i < estudiantes.length; i++){
           suma_notas_curso = suma_notas_curso + estudiantes[i].getNota();
       }
       promedio_notas_curso = suma_notas_curso/cantidadAlumnos;
       System.out.println("El promedio de las notas del curso es: "+(suma_notas_curso/cantidadAlumnos));
       
       //Calculo de cantidad de alumnos con nota mayor al promedio para luego crear el arreglo de nombres con esa dimension
       for(int i = 0; i < estudiantes.length; i++){
           if(estudiantes[i].getNota() > promedio_notas_curso){
               mayor_al_promedio++;
           }
       }
       
       //Construye el arreglo de nombre de estudiantes que tienen nota mayor al promedio
       String[] estudiantesMayor = new String[mayor_al_promedio];
       int j=0;
       for(int i = 0; i < estudiantes.length; i++){
           if(estudiantes[i].getNota() > promedio_notas_curso){
               estudiantesMayor[j] = estudiantes[i].getNombre();
               j=j+1;
           }
       }
       
       System.out.println("Estudiantes con nota mayor al promedio");
       System.out.println("");
       for(int i = 0; i < estudiantesMayor.length; i++){
           System.out.println(estudiantesMayor[i]);
       
       
    }
    
}
}
