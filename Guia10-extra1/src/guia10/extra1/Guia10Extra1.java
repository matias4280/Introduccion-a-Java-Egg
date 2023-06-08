/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.extra1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
//Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
//los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
//introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
//programa mostrará por pantalla el número de valores que se han leído, su suma y su
//media (promedio).
public class Guia10Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        
        System.out.println("Ingrese un numero distint de -99 o el programa terminará");
        Integer num = leer.nextInt();
        while (num != -99) {
            numeros.add(num);
            System.out.println("Ingrese un numero distint de -99 o el programa terminará");
            num = leer.nextInt();
        }
        System.out.println("Se ingresaron " + numeros.size() + " numeros");

        int suma = 0;
        double promedio;
        for (Integer numero : numeros) {
            suma = numero + suma;
        }
        System.out.println("La suma de los numeros del arreglo es: " + suma);
        if (!numeros.isEmpty()) {
            promedio = suma / numeros.size();
            System.out.println("El promedio de los numeros del arreglo es: " + promedio);
        }
 
        

    }

}
