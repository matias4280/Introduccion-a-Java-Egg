/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebascolecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author Matias
 */
public class PruebasColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> palabras = new HashSet();
        palabras.add("hola");
        palabras.add("chau");
        palabras.add("como");
        palabras.add("nada");
        palabras.add("hola");
        for(String p: palabras){
            System.out.println(p);
        }
        palabras.remove("hola");
        for(String p: palabras){
            System.out.println(p);
        }
    }
    
}
