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
public class ej5_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido, ingrese que tipo de socio es");
        System.out.println("A) - Socios tipo A");
        System.out.println("B) - Socios tipo B");
        System.out.println("C) - Socios tipo C");
        String opcion = leer.nextLine();
        System.out.println("Ingrese el monto del tratamiento");
        int montoTratamiento = leer.nextInt();
        switch (opcion) {
            case "A":
                System.out.println("Los socios tipo A tienen 50% de descuento en tratamientos");
                System.out.println("Su tratamiento de "+montoTratamiento+" queda en "+(montoTratamiento*0.5));
                break;
            case "B":
                System.out.println("Los socios tipo B tienen 35% de descuento en tratamientos");
                System.out.println("Su tratamiento de "+montoTratamiento+" queda en "+(montoTratamiento*0.35));
                break;
            case "C":
                System.out.println("Los socios tipo C no tienen descuento en tratamientos");
                System.out.println("Su tratamiento de "+montoTratamiento+" queda en "+montoTratamiento);
                break;
            default:
                System.out.println("Opcion no valida");;
        }
    }
    
}
