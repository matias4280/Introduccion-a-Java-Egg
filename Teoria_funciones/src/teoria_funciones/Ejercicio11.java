/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria_funciones;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        
        String palabra = leer.nextLine();
        
        String frase="";
        
        String ultimaLetra = palabra.substring(palabra.length()-1, palabra.length());
        //Mientras la ultima letra de la palabra no sea un "." sigo pidiendo que ingrese palabras
        while(!ultimaLetra.equals(".")){
            frase = frase.concat(palabra+" "); //forma la frase con cada cosa que ingreso
            System.out.println("Siga con la frase o escriba . para terminar");
            palabra = leer.nextLine();
            ultimaLetra = palabra.substring(palabra.length()-1, palabra.length());
        }
        frase = frase.concat(palabra); //concatena a la frase con la ultima palabra que ingreso con el "."
        System.out.println("Su frase sin procesar es: "+frase);
        System.out.println("Su frase procesada es: "+procesarFrase(frase));
    }
    public static String procesarFrase(String frase){
        
        String fraseModificada = "";
        
       
        for(int i=0; i<frase.length(); i++){

            String letra = frase.substring(i,i+1);
            switch (letra.toLowerCase()) {
            case "a":
                fraseModificada = fraseModificada.concat("@");
                break;
            case "e":
                fraseModificada = fraseModificada.concat("#");
                break;
            case "i":
                fraseModificada = fraseModificada.concat("$");
                break;
            case "o":
                fraseModificada = fraseModificada.concat("%");
                break;
            case "u":
                fraseModificada = fraseModificada.concat("*");
                break;
            default:
                fraseModificada = fraseModificada.concat(letra);
        }
        }
        return fraseModificada; //devuelve al programa principal (Main), la frase procesada
    }
    }
    
