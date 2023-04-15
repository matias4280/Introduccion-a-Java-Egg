/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad en Euros");
        double monto = leer.nextDouble();
        System.out.println("Ingrese la divisa a la que quiere convertir el monto");
        leer.nextLine();
        String divisa = leer.nextLine();
        convertirDivisa(monto,divisa);
    }
    
    public static void convertirDivisa(double monto, String divisa){
        
        switch (divisa) {
            case "yenes":
                double yenes = monto*129.852;
                System.out.println("El monto ingresado en euros es equivalente a "+yenes+" yenes");
                break;
            case "dolares":
                double dolares = monto*1.28611;
                System.out.println("El monto ingresado en euros es equivalente a "+dolares+" dolares");
                break;
            case "libras":
                double libras = monto*0.86;
                System.out.println("El monto ingresado en euros es equivalente a "+libras+" libras");
                break;   
            default:
                System.out.println("La divisa seleccionada es invalida");;
        }
    }
}
