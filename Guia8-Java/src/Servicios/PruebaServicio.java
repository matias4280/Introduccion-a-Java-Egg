/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Prueba;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class PruebaServicio {
    Scanner leer = new Scanner(System.in);
    Prueba entidadPrueba = new Prueba();
    
    public Prueba crearEntidadPrueba(){
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        entidadPrueba = new Prueba(numero);
        return entidadPrueba;
    }
}
