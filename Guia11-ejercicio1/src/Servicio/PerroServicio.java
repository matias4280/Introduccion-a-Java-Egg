/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import Enumeraciones.Tamaño;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class PerroServicio {

    public Perro crearPerro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del perro");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la raza del perro");
        String raza = leer.nextLine();
        System.out.println("Ingrese la edad del perro");
        int edad = leer.nextInt();
        System.out.println("Ingrese el tamaño del perro");
        leer.nextLine();
        String tam = leer.nextLine();
        Tamaño tamaño = null;
        boolean opc = true;
        while (opc) {
            switch (tam) {
                case "chico":
                    tamaño = Tamaño.CHICO;
                    opc = false;
                    break;
                case "mediano":
                    tamaño = Tamaño.MEDIANO;
                    opc = false;
                    break;
                case "grande":
                    tamaño = Tamaño.GRANDE;
                    opc = false;
                    break;
                default:
                    System.out.println("Ingrese algo valido");
                    tam = leer.nextLine();
            }
        }
        Perro nuevoPerro;
        nuevoPerro = new Perro(nombre, raza, edad, tamaño);
        return nuevoPerro;
    }
}
