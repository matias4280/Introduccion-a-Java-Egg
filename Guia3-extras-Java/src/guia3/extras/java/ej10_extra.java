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
public class ej10_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //La funcion random devuelve un valor entre 0 y 1. Es por esto que se lo multiplica por 10 para que genere numeros entre 0 y 10
        //La funcion random devuelve valores double, se los pasa a (int) para que los trunque a enteros
        int numeroAleatorio1 = (int) (Math.random()*10);
        int numeroAleatorio2 = (int) (Math.random()*10);
        int multiplicacion = numeroAleatorio1*numeroAleatorio2;
        
        System.out.println(numeroAleatorio1+" "+numeroAleatorio2+" "+multiplicacion); //linea para saber que numeros tocaron y probar luego el programa
        
        System.out.println("Intente adivinar el resultado de la multiplicacion");
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        
        while(numero != multiplicacion){
            System.out.println("Incorrecto. Ingrese otro numero");
            numero = leer.nextInt();
        }
        System.out.println("Adivinaste! El resultado de la multiplicacion era "+multiplicacion);
    }
    
}
