/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Matias
 */


public class AhorcadoServicio {
    
    private String[] encontradas;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
        
    public Ahorcado crearJuego(){
    
        Ahorcado a1 = new Ahorcado();
        System.out.println("Ingrese la palabra: ");
        String cadena = leer.next();
        String[] aux;
        aux = cadena.split("");
        a1.setPalabra(aux);
       
        System.out.println("Palabra cargada");
        System.out.println("Ingrese la cantidad de jugadas maxima: ");
        a1.setCant_jugadas_maximas(leer.nextInt());
        a1.setCant_letras_encontradas(0);
        encontradas = new String[a1.getPalabra().length];
        Arrays.fill(encontradas, "_");
      
        
        return a1;
            
    
    
    //Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.

   
    
    
    }
       public void longitud(Ahorcado a1){
        
        System.out.println("La longitud de la palabra es: " + a1.getPalabra().length);


    }
       
       public boolean buscarLetra(Ahorcado a1, String letra){
           boolean bandera = false;
           for(int i = 0; i<a1.getPalabra().length; i++){
               if(a1.getPalabra()[i].equalsIgnoreCase(letra)){
                   bandera = true;
               }
           }
           if(bandera){
               System.out.println("La letra está en la palabra");
           }else{
               System.out.println("La letra no se encuentra en la palabra");
           }
           return bandera;
       }
       public boolean encontradas(Ahorcado a1, String letra){
           boolean encontroLetra = buscarLetra(a1,letra);
           for(int i = 0; i<a1.getPalabra().length; i++){
               if(a1.getPalabra()[i].equalsIgnoreCase(letra)){
                   encontradas[i]=letra;
                   a1.setCant_letras_encontradas(a1.getCant_letras_encontradas()+1);
               }
           }
          
          
           return encontroLetra;
       }
       
       public int intentos(Ahorcado a1){
           return a1.getCant_jugadas_maximas();
       }
       
       public void juego(Ahorcado a1){
           
           do{
             
               System.out.println("Ingrese una letra ");
               String letra = leer.next();
               if(!this.encontradas(a1, letra)){
                  
                   a1.setCant_jugadas_maximas(a1.getCant_jugadas_maximas()-1);
               }
               int faltantes = a1.getPalabra().length - a1.getCant_letras_encontradas();
               System.out.println(Arrays.toString(encontradas));
               if(a1.getCant_letras_encontradas()== a1.getPalabra().length){
                   System.out.println("GANASTE!!!");
               }else{
                   System.out.println("Número de letras (encontradas, faltantes): " + "(" + a1.getCant_letras_encontradas() + "," + faltantes + ")");

                   System.out.println("Cantidad de intentos restantes " + this.intentos(a1));
               }
               
           }while(a1.getCant_jugadas_maximas()>0 && a1.getCant_letras_encontradas()!=a1.getPalabra().length);
           
           if(a1.getCant_jugadas_maximas()==0){
               System.out.println("Perdiste, suerte para la proxima");
               System.out.println("La palabra era: "+Arrays.toString(a1.getPalabra()));
           }
}
}
