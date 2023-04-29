/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Juego {
    private int num_jugador1, num_jugador2;
    private int cantIntentos;
    
    
    
    public void iniciar_juego(){
        this.cantIntentos = 2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenidos al Juego");
        System.out.println("Jugador 1 ingrese un numero");
        this.num_jugador1 = leer.nextInt();
        //for inncesesario, solo es para que el numero ingresado por jugador 1 desaparezca de la pantalla
        for (int i = 0; i<20;i++){
            System.out.println("");
        }
        System.out.println("Jugador 2, intente adivinar el numero ingresado por el Jugador 1");
        this.num_jugador2 = leer.nextInt();
       
        while(this.num_jugador1 != this.num_jugador2 && this.cantIntentos > 0){
            System.out.println("Incorrecto, siga intentando. Ingrese otro numero");
            
            this.num_jugador2 = leer.nextInt();
         
            this.cantIntentos = this.cantIntentos - 1;
        }
        if(this.cantIntentos == 0){
            System.out.println("Perdiste, te quedaste sin intentos");
            System.out.println("El numero ingreado por el Jugador 1 era: "+this.num_jugador1);
        }else{
            if(this.num_jugador1 == this.num_jugador2){
                System.out.println("Adivinaste!, bien jugado");
            }
        }
    }
}
