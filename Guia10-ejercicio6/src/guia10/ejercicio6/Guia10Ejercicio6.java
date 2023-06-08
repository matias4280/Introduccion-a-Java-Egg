/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.ejercicio6;

import Servicios.ProductoServicio;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Guia10Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ProductoServicio ps = new ProductoServicio();
        int opcion;
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("Bienvenido a su Tienda");
            System.out.println("1-Agregar Productos");
            System.out.println("2-Agregar un producto a la lista");
            System.out.println("3-Modificar precio de producto");
            System.out.println("4-Eliminar producto");
            System.out.println("5-Mostrar productos cargados");
            System.out.println("6-Salir");
            System.out.println("Eliga la opcion deseada");
            System.out.println("");
            System.out.println("");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("AGREGUE SUS PRODUCTOS");
                    System.out.println("");
                    ps.agregarProductos();

                    break;
                case 2:
                    System.out.println("AGREGUE UN PRODUCTO NUEVO");
                    System.out.println("");
                    ps.agregarProducto();
                    break;
                case 3:
                    System.out.println("MODIFIQUE UN PRODUCTO");
                    System.out.println("");
                    ps.modificarProducto();
                    break;
                case 4:
                    System.out.println("ELIMINE UN PRODUCTO");
                    System.out.println("");
                    ps.eliminarProducto();
                    break;
                case 5:
                    System.out.println("ESTOS SON LOS PRODUCTOS DISPONIBLES");
                    System.out.println("");
                    ps.mostrarProductos();
                    break;
                case 6:
                    System.out.println("SALDRA DE LA TIENDA");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 6);

    }

}
