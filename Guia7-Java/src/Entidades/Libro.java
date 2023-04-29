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
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro() {
    }
    
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los datos del libro que desea cargar");
        System.out.println("Ingrese el ISBN");
        this.ISBN = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el titulo");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese el autor");
        this.autor = leer.nextLine();
        System.out.println("Ingrese la cantidad de paginas");
        this.numeroPaginas = leer.nextInt();
        System.out.println("Libro cargado");
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }
    
    public void mostrarLibro(){
        System.out.println(this.toString());
    }
}
