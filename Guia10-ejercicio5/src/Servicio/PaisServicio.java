/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class PaisServicio {
 private HashSet<String> paises; 
 
 public PaisServicio(){
     this.paises = new HashSet();
 }
 
 public String crearPais(){
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese un pais");
     String pais = leer.nextLine();
     return pais;
 }
 public void crearPaises(){
      Scanner leer = new Scanner(System.in);
        boolean bandera = false;
        String opcion;
        while(!bandera){
          this.paises.add(this.crearPais());
           System.out.println("Quiere agregar mas paises? Ingrese si o no");
           opcion = leer.nextLine();
           if(opcion.equalsIgnoreCase("no")){
               bandera = true;
           }
        }
        System.out.println("Fueron creados "+this.paises.size()+" paises. ");
        
 }
 public void mostrarPaises(){
     for(String paisAux: this.paises){
         System.out.println(paisAux);
     }
 }
 
 public void mostrarPaisesOrdenado(){
    //Se convierte el hashSet a Lista
    ArrayList<String> paises2 = new ArrayList(this.paises);
    Collections.sort(paises2);
     for(String paisAux: paises2){
         System.out.println(paisAux);
     }
 }
 
 //no se pide en el enunciado, pero es otra forma. 
 public void borrarPais2(){
     Scanner leer = new Scanner(System.in);
     boolean bandera = false;
     System.out.println("Escriba un pais que desee borrar de la lista");
     String nombrePais = leer.nextLine();
     if(this.paises.contains(nombrePais)){
         this.paises.remove(nombrePais);
         bandera = true;
     }
     if(bandera){
         System.out.println("Se removio el pais de la lista");
         this.mostrarPaisesOrdenado();
     }else{
         System.out.println("No se ha encontrado el pais ingresado");
     }
 }
 
 //en el enunciado se pide usar un iterator
 public void borrarPais(){
     boolean bandera = false;
     Scanner leer = new Scanner(System.in);
     System.out.println("Escriba un pais que desee borrar de la lista");
     String nombrePais = leer.nextLine();
     Iterator iterador = this.paises.iterator();
     while(iterador.hasNext()){
         if(iterador.next().equals(nombrePais)){
             iterador.remove();
             bandera = true;
         }
     }
     
     if(bandera){
         System.out.println("Se removio el pais de la lista");
         this.mostrarPaisesOrdenado();
     }else{
         System.out.println("No se ha encontrado el pais ingresado");
     }
 }
}
