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
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        this.base=leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        this.altura = leer.nextDouble();
}
    
    public double superficie(){
        return (this.base*this.altura);
    }
    
    public double perimetro(){
        return (2*(this.base+this.altura));
    }
    
    public void dibujarRectangulo(){
        for(int i = 1; i<=this.altura;i++){
            for(int j = 1; j<=this.base;j++){
                if(i == 1 || j == 1 || i == this.altura || j == this.base){
                  System.out.print(" * ");  
                }else{
                  System.out.print("   ");
                }
                
            }
           System.out.println(" ");
        }
    }
    
}
