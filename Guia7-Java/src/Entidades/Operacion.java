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
public class Operacion {
    private int num1,num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para realizar una operacion");
        System.out.println("Ingrese el primer numero");
        this.num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        this.num2 = leer.nextInt();
    }
    public int suma(){
        return this.num1 + this.num2;
    }
    public int resta(){
        return this.num1 - this.num2;
    }
    public int multiplicacion(){
        if(num1 == 0 || num2 == 0){
            System.out.println("Uno de los numero es cero, el resultado dará 0");
            return 0;
        }else{
            return this.num1 * this.num2;
        }
    }
    public double division(){
        if(this.num2 == 0){
            System.out.println("El segundo numero es cero. NO se puede dividir por cero");
            return 0;
        }else{
            return (this.num1 / this.num2);
        }
    }
}   
