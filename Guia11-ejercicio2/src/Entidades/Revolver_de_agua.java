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
public class Revolver_de_agua {
    private int posicion_actual;
    private int posicion_agua;    


public Revolver_de_agua(){
}

public void llenarRevolver(){
  
    this.posicion_actual = (int)(Math.random()*6+1);
   
    
    this.posicion_agua = (int)(Math.random()*6+1);
}

public boolean mojar(){
    if(this.posicion_actual == this.posicion_agua){
        return true;
    }else{
        return false;
    }
}

public void siguienteChorro(){
    if(this.posicion_actual==6){
        this.posicion_actual=1;
    }else{
        this.posicion_actual = this.posicion_actual+1;
    }
    
}

    public int getPosicion_actual() {
        return posicion_actual;
    }

    public void setPosicion_actual(int posicion_actual) {
        this.posicion_actual = posicion_actual;
    }

    public int getPosicion_agua() {
        return posicion_agua;
    }

    public void setPosicion_agua(int posicion_agua) {
        this.posicion_agua = posicion_agua;
    }

    @Override
    public String toString() {
        return "Revolver_de_agua{" + "posicion_actual=" + posicion_actual + ", posicion_agua=" + posicion_agua + '}';
    }


}

