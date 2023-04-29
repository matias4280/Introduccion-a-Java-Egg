/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_extras;

import Entidades.Empleado;

/**
 *
 * @author Matias
 */
public class ejercicio5_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jorge",31,50000);
        Empleado empleado2 = new Empleado("Hernan",29,50000);
        //antes del incremento
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println("");
        empleado1.calcular_aumento();
        empleado2.calcular_aumento();
        //despues del incremento
        System.out.println("");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        

       
    }
    
}
