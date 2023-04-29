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
public class Puntos {
    private int x1,y1;
    private int x2,y2;

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Puntos() {
    }

    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas X e Y del punto 1");
        System.out.println("Ingrese x1");
        this.x1 = leer.nextInt();
        System.out.println("Ingrese y1");
        this.y1 = leer.nextInt();
        System.out.println("Ingrese las coordenadas X e Y del punto 2");
        System.out.println("Ingrese x2");
        this.x2 = leer.nextInt();
        System.out.println("Ingrese y2");
        this.y2 = leer.nextInt();
    }
    
    public double calcularDistancia(){
        double distancia = Math.sqrt((Math.pow(this.x2-this.x1, 2))+(Math.pow(this.y2-this.y1, 2)));
        return distancia;
    }
    
    
}
