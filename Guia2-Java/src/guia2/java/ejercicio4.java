/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.java;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en grados °C para convertirla en a grados °F");
        double gradosC = leer.nextDouble();
        double gradosF = 32 + (9 * gradosC / 5);
        System.out.println("La temperatura convertida a grados °F es: "+gradosF);
    }
    
}
