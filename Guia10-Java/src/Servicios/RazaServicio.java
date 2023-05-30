/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class RazaServicio {
    private ArrayList<String> razas;
    
    public RazaServicio(){
        this.razas = new ArrayList();
        
    }
    
    public String crearRaza(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una raza");       
        String razaNueva = leer.nextLine();
        return razaNueva;
    }
    
    public void crearRazas(){
        Scanner leer = new Scanner(System.in);
        boolean bandera = false;
        String opcion;
        while(!bandera){
           this.razas.add(this.crearRaza());
           System.out.println("Quiere agregar mas razas? Ingrese si o no");
           opcion = leer.nextLine();
           if(opcion.equalsIgnoreCase("no")){
               bandera = true;
           }
        }
        System.out.println("Fueron creadas "+this.razas.size()+" razas. ");
    }
    
    public void mostrarRazas(){
        for(String razaAux: this.razas){
            System.out.println(razaAux);
        }
    }
    
    public void eliminarRaza(){
        boolean bandera = false;
        System.out.println("Ingrese una raza para eliminarla");
        
        Scanner leer = new Scanner(System.in);
        String razaBorrar = leer.nextLine();
        
        Iterator iterador = this.razas.iterator();
        while(iterador.hasNext()){
            if(iterador.next().equals(razaBorrar)){
                bandera = true;
                iterador.remove();
            }
        }

        if(bandera){
            System.out.println("Se elimino al menos una raza");
        }else{
            System.out.println("No se elimino ninguna raza");
        }
     
        Collections.sort(this.razas);
        this.mostrarRazas();
    }
}
