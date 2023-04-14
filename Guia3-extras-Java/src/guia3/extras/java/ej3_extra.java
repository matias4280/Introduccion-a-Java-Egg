/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.extras.java;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class ej3_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        switch (letra.toLowerCase()) {
            case "a":
                System.out.println("Su letra es la vocal "+letra.toLowerCase());
                break;
            case "e":
                System.out.println("Su letra es la vocal "+letra.toLowerCase());
                break;
            case "i":
                System.out.println("Su letra es la vocal "+letra.toLowerCase());
                break;
            case "o":
                System.out.println("Su letra es la vocal "+letra.toLowerCase());
                break;
            case "u":
                System.out.println("Su letra es la vocal "+letra.toLowerCase());
                break;
            default:
                System.out.println("La letra ingresada no es una vocal, es la letra: "+letra.toLowerCase());;
        }
    }
    
}
