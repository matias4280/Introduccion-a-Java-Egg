/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Cuenta {
    private double saldo;
    private String titular;

    public Cuenta() {
    }
    
    public Cuenta(double saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirar_dinero(){
        Scanner leer = new Scanner(System.in);
        double retiro;
        System.out.println("Saldo disponible: " + this.saldo);
        System.out.println("Ingrese la cantidad que desea retirar");
        retiro = leer.nextDouble();
        if( this.saldo - retiro < 0 ){
            System.out.println("No posee dinero sufiente");
        }else{
            this.saldo = this.saldo - retiro;
        }
        
    }
}
