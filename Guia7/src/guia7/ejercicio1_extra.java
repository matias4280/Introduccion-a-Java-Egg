/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import Entidades.Cancion;

/**
 *
 * @author Matias
 */
public class ejercicio1_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cancion cancion1 = new Cancion("November Rain","Guns & Roses");
      
       System.out.println(cancion1.toString());
       
       Cancion cancion2 = new Cancion();
      
       System.out.println(cancion2.toString());
    }
    
}
