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
public class Ahorcado {
    
    private int cant_letras_encontradas;
    private int cant_jugadas_maximas;
    private String [] palabra;

    public Ahorcado() {
    }

    public Ahorcado(int letras, int jugadas, String[] palabra) {
        this.cant_letras_encontradas = letras;
        this.cant_jugadas_maximas = jugadas;
        
        this.palabra = palabra;
    }

    public int getCant_letras_encontradas() {
        return cant_letras_encontradas;
    }

    public void setCant_letras_encontradas(int cant_letras_encontradas) {
        this.cant_letras_encontradas = cant_letras_encontradas;
    }

    public int getCant_jugadas_maximas() {
        return cant_jugadas_maximas;
    }

    public void setCant_jugadas_maximas(int cant_jugadas_maximas) {
        this.cant_jugadas_maximas = cant_jugadas_maximas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

  
    
    
   
     
}

