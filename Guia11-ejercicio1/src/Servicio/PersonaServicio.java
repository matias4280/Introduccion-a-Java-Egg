/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class PersonaServicio {
    
    public Persona crearPersona() {
        Persona nuevaPersona = new Persona();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = leer.nextLine();
        nuevaPersona.setNombre(nombre);
        System.out.println("Ingrese el apellido");
        String apellido = leer.nextLine();
        nuevaPersona.setApellido(apellido);
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        nuevaPersona.setEdad(edad);
        System.out.println("Ingrese el documento");
        
        long documento = leer.nextLong();
        nuevaPersona.setDocumento(documento);
        return nuevaPersona;
    }
    
    public void adoptarPerro(Persona persona1, Perro perro1){
        persona1.setPerro(perro1);
    }
}
