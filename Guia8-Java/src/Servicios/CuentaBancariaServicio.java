/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class CuentaBancariaServicio {
    
    private CuentaBancaria cuentaNueva;
    
    public CuentaBancaria crearCuenta(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        cuentaNueva = new CuentaBancaria();
        System.out.println("Ingrese DNI");
        cuentaNueva.setDniCliente(leer.nextLong());
        System.out.println("Ingrese un numero de cuenta");
        cuentaNueva.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el saldo");
        cuentaNueva.setSaldoActual(leer.nextDouble());
        System.out.println("Cuenta creada correctamente");
        
        return cuentaNueva;
    }
    
    
   public void retirar(double saldo){
     
       if(cuentaNueva.getSaldoActual() == 0){
           System.out.println("Su cuenta no tiene fondos. No se puede retirar");
       }else{
          if(cuentaNueva.getSaldoActual() < saldo){
              System.out.println("El importe que desea retirar excede el saldo disponible");
              System.out.println("Se le dará todo el saldo disponible");
              cuentaNueva.setSaldoActual(cuentaNueva.getSaldoActual() - cuentaNueva.getSaldoActual());
              System.out.println("Su cuenta quedo en: "+cuentaNueva.getSaldoActual());
          }else{
              cuentaNueva.setSaldoActual(cuentaNueva.getSaldoActual() - saldo);
              System.out.println("Retiro exitoso. Su saldo disponible ahora es: "+cuentaNueva.getSaldoActual());
          } 
       }
       
       }
   }
