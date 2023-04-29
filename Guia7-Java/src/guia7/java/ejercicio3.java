/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.java;

import Entidades.Operacion;

/**
 *
 * @author Matias
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        System.out.println("La suma de "+operacion.getNum1()+" y "+operacion.getNum2()+" es: "+operacion.suma());
        System.out.println("La resta de "+operacion.getNum1()+" y "+operacion.getNum2()+" es: "+operacion.resta());
        System.out.println("La multiplicacion de "+operacion.getNum1()+" y "+operacion.getNum2()+" es: "+operacion.multiplicacion());
        System.out.println("La division de "+operacion.getNum1()+" y "+operacion.getNum2()+" es: "+operacion.division());
    }
    
}
