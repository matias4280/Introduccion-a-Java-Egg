/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.java;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        String salir= " ";
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
                int suma = numero1+numero2;
                System.out.println("La suma es: "+suma);
                break;
            case 2:
                int resta = numero1-numero2;
                System.out.println("La resta es: "+resta);
                break;
            case 3:
                int multi = numero1*numero2;
                System.out.println("La multiplicacion es: "+multi);
                break;
            case 4:
                double division = numero1/numero2;
                System.out.println("La division es: "+division);
                break;
            case 5:{
                System.out.println("Eligió la opcion 5");
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                leer.nextLine();//Se usa esta linea para que ande correctamente la siguiente. Es un caso particular
                salir = leer.nextLine();
                if(salir.equals("N")){
                    continue;
                }
                break;
            }
            default:
                System.out.println("La opcion no es valida");
        }
        }while(!salir.equals("S"));
        
    }
    
}
