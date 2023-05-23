/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.java;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author Matias
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio perSer = new PersonaServicio();
        Persona[] Personas = new Persona[2];
        int [] IMCs = new int[2];
        boolean [] edades = new boolean[2];
        
        for(int i = 0; i<Personas.length;i++){
           Personas[i] = perSer.crearPersona();
           IMCs[i] = perSer.calcularIMC(Personas[i]);
           edades[i] = perSer.esMayorDeEdad(Personas[i]); 
        }
        
        //foreach en java
        for (Persona vectorPersona : Personas) {
            System.out.println(vectorPersona.toString());
        }
      
            
    }
    
}
