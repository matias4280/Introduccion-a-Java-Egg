/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11.ejercicio2;

import Entidades.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Guia11Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in);
      ArrayList<Jugador> jugadores = new ArrayList();
      Revolver_de_agua rev = new Revolver_de_agua();
      rev.llenarRevolver();
      Jugador jugadornuevo;
      for(int i = 0; i<3; i++){
        jugadornuevo = new Jugador();
        jugadores.add(jugadornuevo);
      }
       System.out.println(rev.toString());
        System.out.println("Jugadores");
       
        Juego j1 = new Juego();
        j1.llenarJuego(jugadores, rev);
        j1.ronda2();
        
        for(int i = 0; i<3; i++){
            System.out.println(jugadores.get(i).toString());
      }
    }
    
}
