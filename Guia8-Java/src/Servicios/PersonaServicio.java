/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class PersonaServicio {
    
   
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su edad ");
        int edad = leer.nextInt();
         leer.nextLine();
        System.out.println("Ingrese su sexo");
       
        String sexo = leer.nextLine();
        
        while(!sexo.equals("H") && !sexo.equals("O") && !sexo.equals("M")){
            System.out.println("El letra debe ser H , M u O");
            System.out.println("Ingrese nuevamente el sexo");
            sexo = leer.nextLine();
        }
        System.out.println("Ingrese su peso");
        double peso = leer.nextDouble();
        System.out.println("Ingrese su altura");
        double altura = leer.nextDouble();
        Persona persona = new Persona(nombre,edad,sexo,peso,altura);
        
        return persona;
    }
   
    public boolean esMayorDeEdad(Persona persona){
        if(persona.getEdad() >= 18){
            return true;
        }else{
            return false;
        }
    }
    
    public int calcularIMC(Persona persona){
        int retorno = 2;
        double peso_ideal = persona.getPeso()/(Math.pow(persona.getAltura(),2));
        if(peso_ideal < 20){
            retorno = -1;
        }else{
            if(peso_ideal >= 20 && peso_ideal <=25){
                retorno = 0;
            }else{
                if(peso_ideal > 25){
                    retorno = 1;
                }
            }
        }
        return retorno;
    }
}

