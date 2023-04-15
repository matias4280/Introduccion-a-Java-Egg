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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        System.out.println("Bienvenido");
        System.out.println("Ingrese dos numeros para realizar algunas operaciones");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        
        
        do{
        System.out.println("Menu");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Salir");
        System.out.println("Elija la opcion que desea ejecutar");
        opc = leer.nextInt();
        switch (opc) {
            case 1:
                System.out.println("La suma es: "+suma(numero1,numero2));
                break;
            case 2:
                System.out.println("La resta es: "+resta(numero1,numero2));
                break;
            case 3:       
                System.out.println("La multiplicacion es: "+multiplicacion(numero1,numero2));
                break;
            case 4:
                System.out.println("La division es: "+division(numero1,numero2));
                break;
            case 5:
                System.out.println("Eligió la opcion 5");
                System.out.println("Saldrá de la aplicación"); 
                break;
            default:
                System.out.println("La opcion no es valida");
        }
        }while(opc!=5);
        
    }
    
    public static int suma(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
    public static int resta(int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }
     public static int multiplicacion(int num1, int num2){
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }
      public static int division(int num1, int num2){
        int division = num1 / num2;
        return division;
    }
    
}
