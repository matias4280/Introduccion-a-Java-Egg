/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11.ejercicio1;

import Entidad.Perro;
import Entidad.Persona;
import Servicio.PerroServicio;
import Servicio.PersonaServicio;

/**
 *
 * @author Matias
 */
public class Guia11Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Creamos las personas");
        PersonaServicio PersonaSer = new PersonaServicio();

        Persona persona1 = PersonaSer.crearPersona();
        Persona persona2 = PersonaSer.crearPersona();

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

        System.out.println("Creamos los perros");

        PerroServicio PerroSer = new PerroServicio();
        Perro perro1 = PerroSer.crearPerro();
        Perro perro2 = PerroSer.crearPerro();

        //asignamos los perros a las personas
        PersonaSer.adoptarPerro(persona1, perro1);
        PersonaSer.adoptarPerro(persona2, perro2);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

    }

}
