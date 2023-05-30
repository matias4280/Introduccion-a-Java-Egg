/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.Collections;
import Utilidades.Comparadores;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class PeliculaServicio {

    private ArrayList<Pelicula> peliculas;

    public PeliculaServicio() {
        this.peliculas = new ArrayList();
    }

    public Pelicula crearPelicula() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo de la pelicula");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el director de la pelicula");
        String director = leer.nextLine();
        System.out.println("Ingrese la duracion de la pelicula");
        double duracion = leer.nextDouble();
        Pelicula peliculaNueva = new Pelicula(titulo, director, duracion);
        return peliculaNueva;
    }

    public void crearPeliculas() {
        Scanner leer = new Scanner(System.in);
        boolean bandera = false;
        String opcion;
        while (!bandera) {
            this.peliculas.add(this.crearPelicula());
            System.out.println("Quiere agregar mas peliculas? Ingrese si o no");
            opcion = leer.nextLine();
            if (opcion.equalsIgnoreCase("no")) {
                bandera = true;
            }
        }
        System.out.println("Fueron creadas " + this.peliculas.size() + " peliculas. ");
    }

    public void mostrarPeliculas() {
        for (Pelicula peliculaAux : this.peliculas) {
            System.out.println(peliculaAux.toString());
        }
    }

    public void mostrarPeliculasMayorA1Hora() {
        for (Pelicula peliculaAux : this.peliculas) {
            if (peliculaAux.getDuracion() > 1) {
                System.out.println(peliculaAux.toString());
            }
        }
    }

    public void ordenarDuracionMayorAMenor() {
        Collections.sort(this.peliculas, Comparadores.compararDuracionMayorAMenor);
        this.mostrarPeliculas();
    }

    public void ordenarDuracionMenorAMayor() {
        Collections.sort(this.peliculas, Comparadores.compararDuracionMenorAMayor);
        this.mostrarPeliculas();
    }

    public void ordenarPorTitulo() {
        Collections.sort(this.peliculas, Comparadores.compararTitulo);
        this.mostrarPeliculas();
    }

    public void ordenarPorDirector() {
        Collections.sort(this.peliculas, Comparadores.compararDirector);
        this.mostrarPeliculas();
    }
}
