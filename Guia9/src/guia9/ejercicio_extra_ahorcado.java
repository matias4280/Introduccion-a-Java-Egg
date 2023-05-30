/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;

import Entidades.Ahorcado;
import Servicios.AhorcadoServicio;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class ejercicio_extra_ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AhorcadoServicio as = new AhorcadoServicio();
        Ahorcado Prueba = as.crearJuego();
        for(int i = 0; i<50; i++){
            System.out.println("");
        }
        as.juego(Prueba);
        
    }
    
}
