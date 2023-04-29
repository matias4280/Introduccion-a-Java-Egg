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
public class Circunferencia {
    private double radio;
    
    public Circunferencia(double radio){
        this.radio = radio;
    }
    public Circunferencia(){}

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        this.radio = leer.nextDouble();   
    }
    
    public double area(){
        return (Math.pow(this.radio,2)*Math.PI);
    }
    
    public double perimetro(){
        return 2*Math.PI*this.radio;
    }
}
