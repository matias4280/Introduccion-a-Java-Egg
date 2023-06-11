/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Matias
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver_de_agua revolver;
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver_de_agua r){
        this.jugadores=jugadores;
        this.revolver=r;
    }
    
//    public void ronda(){
//        boolean bandera = false;
//        for (int i = 0; i < this.jugadores.size(); i++) {
//            if(this.jugadores.get(i).disparo(revolver)){
//               bandera = true;
//               System.out.println("DISPARO HECHO!!");
//               break; 
//            }
//        }
//        if(!bandera){
//            this.ronda();
//        }
//    }
 public void ronda2(){
        boolean bandera = false;
        do{
        for (int i = 0; i < this.jugadores.size(); i++) {
            System.out.println(this.revolver.toString());
            if(this.jugadores.get(i).disparo(revolver)){
               bandera = true;
               System.out.println("DISPARO HECHO!!");
               break; 
            }
        }
        }while(!bandera);
        
    }
}
