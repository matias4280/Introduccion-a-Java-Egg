/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Matias
 */
public class Jugador {

    public static int id = 0;
    private int id_jugador;
    private String nombre;
    private boolean mojado;

    public Jugador() {

        this.id_jugador = Jugador.id + 1;
        this.nombre = "Jugador " + this.id_jugador;
        this.mojado = true;
        Jugador.id = Jugador.id + 1;
    }

    public boolean disparo(Revolver_de_agua r) {
        if (r.mojar()) {
            this.mojado = false; //el jugador está mojado
            return true; //hizo el disparo con agua
        } else {
            r.siguienteChorro();
            return false; //se hizo el disparo pero no mojó al jugador, siga siga...
        }
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", mojado=" + mojado + '}';
    }

}
