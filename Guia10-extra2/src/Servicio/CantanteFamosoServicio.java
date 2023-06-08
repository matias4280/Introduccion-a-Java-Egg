/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class CantanteFamosoServicio {
    
    public CantanteFamoso crearCantante(){
        System.out.println("CREE UN NUEVO CANTANTE");
        System.out.println("Ingrese el nombre del cantante");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.nextLine();
        System.out.println("Ingrese el disco mas vendido");
        String disco = leer.nextLine();
        CantanteFamoso cantanteNuevo = new CantanteFamoso(nombre,disco);
        return cantanteNuevo;
    }
    
    public void mostrarCantantes(ArrayList<CantanteFamoso> cantantes){
        System.out.println("CANTANTES");
        for (int i = 0; i < cantantes.size(); i++) {
            System.out.println(cantantes.get(i).toString());
        }
    }
    
    public void eliminarCantante(ArrayList<CantanteFamoso> cantantes){
        System.out.println("ELIMINE UN CANTANTE");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el cantante que quiere eliminar");
        String nombre = leer.nextLine();
        for (int i = 0; i < cantantes.size(); i++) {
            if(nombre.equals(cantantes.get(i).getNombre())){
                cantantes.remove(i);
            }
        }
    }
    
    
    
}
