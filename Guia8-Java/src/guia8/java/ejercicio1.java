/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.java;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/**
 *
 * @author Matias
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        
        CuentaBancaria cuenta = servicio.crearCuenta();
        servicio.retirar(300);
        
        
        
    }
    
}
