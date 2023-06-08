/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.extra2;

import Entidad.CantanteFamoso;
import Servicio.CantanteFamosoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Guia10Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creamos la lista
        CantanteFamosoServicio cfs = new CantanteFamosoServicio();
        ArrayList<CantanteFamoso> cantantes = new ArrayList();
        for (int i = 0; i < 5; i++) {
            cantantes.add(cfs.crearCantante());
        }
        Scanner leer = new Scanner(System.in);
        int opc;
        do {
            System.out.println("1-Ingrese un nuevo cantante  \n"
                    + "2-Elimine un cantante \n"
                    + "3-Mostrar cantantes \n"
                    + "4-Salir");
            System.out.println("Ingrese una opcion");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    cantantes.add(cfs.crearCantante());
                    break;
                case 2:
                    cfs.eliminarCantante(cantantes);
                    break;
                case 3:
                    cfs.mostrarCantantes(cantantes);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opc invalida");
            }
        } while (opc != 4);

        System.out.println("Lista resultante");
        cfs.mostrarCantantes(cantantes);

    }

}
