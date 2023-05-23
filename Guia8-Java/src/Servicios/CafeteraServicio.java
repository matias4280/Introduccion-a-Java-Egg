/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;

/**
 *
 * @author Matias
 */
public class CafeteraServicio {
    
    private Cafetera cafetera = new Cafetera();
    
    public Cafetera llenarCafetera(){
        cafetera.setCapacidadMaxima(1000);
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        return cafetera;
    }
    
    public void servirTaza(int tamaño){
        if(cafetera.getCantidadActual() >= tamaño){
            cafetera.setCantidadActual(cafetera.getCantidadActual()-tamaño);
            System.out.println("Su taza de tamaño "+tamaño+" se llenó por completo");
        }else{
            System.out.println("El cafe no alcanza a llenar la taza");
            System.out.println("Se llenará la taza con el cafe disponible");
               
            System.out.println("La taza se llenó con "+cafetera.getCantidadActual()+" cc.");
            System.out.println("Faltaron por llenar"+(tamaño-cafetera.getCantidadActual())+" cc.");
            cafetera.setCantidadActual(0);
        }
        System.out.println("En la cafetera quedan "+cafetera.getCantidadActual()+" cc");
    }
    
     public void vaciarCafetera(){
        cafetera.setCantidadActual(0);
         System.out.println("La cafetera ahora esta vacia");
    }
     public void agregarCafe(int cantidad){
         if(cantidad+cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()){
             System.out.println("La cantidad de cafe que quiere agregar es demasiada");
             System.out.println("Ingrese otra cantidad");
         }else{
             cafetera.setCantidadActual(cafetera.getCantidadActual()+cantidad);
             System.out.println("En la cafetera ahora hay "+cafetera.getCantidadActual()+" cc");
         }
        
         
     }
}
