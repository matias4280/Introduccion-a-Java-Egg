/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class AlumnoServicio {
    private ArrayList<Alumno> alumnos;
    
    public AlumnoServicio(){
        this.alumnos = new ArrayList();
        
    }
    
    public Alumno crearAlumno(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno");       
        String nombre = leer.nextLine();
        System.out.println("Ingrese las notas del alumno");
        ArrayList<Double> notas = new ArrayList();
        for(int i = 0; i<3; i++){
            System.out.println("Ingrese la nota "+(i+1));
            notas.add(leer.nextDouble());
        }
        Alumno alumnoNuevo = new Alumno(nombre,notas);
        return alumnoNuevo;
    }
    
    public void crearAlumnos(){
        Scanner leer = new Scanner(System.in);
        boolean bandera = false;
        String opcion;
        while(!bandera){
           this.alumnos.add(this.crearAlumno());
           System.out.println("Quiere agregar mas alumos? Ingrese si o no");
           opcion = leer.nextLine();
           if(opcion.equalsIgnoreCase("no")){
               bandera = true;
           }
        }
        System.out.println("Fueron creados "+this.alumnos.size()+" alumnos. ");
    }
    
    public void mostrarAlumnos(){
        for(Alumno auxAlumno: this.alumnos){
            System.out.println(auxAlumno.toString());
        }
    }
    public double NotaFinal() {

        double sumaNotas = 0;
        double promedio = 0;
        ArrayList<Double> notas;
        Alumno alumnoEncontrado = null;
        System.out.println("Ingrese el nombre del alumno para calcular su nota final");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.nextLine();
        //Busco el alumno en la lista de alumnos con el nombre ingresado
        for (Alumno alumnoAux : this.alumnos) {
            if (alumnoAux.getNombre().equals(nombre)) {
                //me guardo en una variable de tipo alumno, el alumno encontrado
                alumnoEncontrado = alumnoAux;
            }
        }
        //Obtengo la lista de notas de alumno encontrado
       
        if (alumnoEncontrado != null) { //si es distinto de null quiere decir que encontre un alumno con ese nombre
            notas = alumnoEncontrado.getNotas();
            //recorro la lista de notas del alumno para calcular el promedio
            for (Double nota : notas) {
                sumaNotas = sumaNotas + nota;
            }
            promedio = sumaNotas / notas.size();
        }
        return promedio;
    }
    
   
    
}
