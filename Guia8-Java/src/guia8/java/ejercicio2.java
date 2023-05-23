/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.java;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cafservicio = new CafeteraServicio();
        System.out.println("Llene su cafetera");
        Cafetera caf1 = cafservicio.llenarCafetera();
        System.out.println(caf1.toString());
        System.out.println("Sirvasé una taza de cafe. De que tamaño es la taza? Ingrese su tamaño");
        cafservicio.servirTaza(leer.nextInt());
        System.out.println("Agregue café, ingrese una cantidad");
        cafservicio.agregarCafe(leer.nextInt());
        System.out.println("Vacie la cafetera para guardarla");
        cafservicio.vaciarCafetera();
        
    }
    
}
