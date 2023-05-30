/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class ProductoServicio {

    private HashMap<String, Double> productos;

    public ProductoServicio() {
        this.productos = new HashMap();
    }

    public void agregarProducto() {
        Scanner leer = new Scanner(System.in);
        String opcion;
        System.out.println("Ingrese un producto");
        String nombreProd = leer.nextLine();
        System.out.println("Ingrese su precio");
        Double precioProd = leer.nextDouble();
        if (!this.productos.containsKey(nombreProd)) {
            this.productos.put(nombreProd, precioProd);
        }
    }

    public void agregarProductos() {
        boolean bandera = false;
        String opcion;
        Scanner leer = new Scanner(System.in);
        while (!bandera) {
            System.out.println("Ingrese un producto");
            String nombreProd = leer.nextLine();
            System.out.println("Ingrese su precio");
            Double precioProd = leer.nextDouble();
            //este if es para que no reemplace el valor de un producto existente.
            if (!this.productos.containsKey(nombreProd)) {
                this.productos.put(nombreProd, precioProd);
            }
            leer.nextLine();
            System.out.println("Quiere seguir agregando productos? Ingrese si o no");
            opcion = leer.nextLine();
            if (opcion.equalsIgnoreCase("no")) {
                bandera = true;
            }
        }
    }

    public void mostrarProductos() {
        for (Map.Entry<String, Double> entry : this.productos.entrySet()) {
            System.out.println("El producto: " + entry.getKey() + " vale " + (entry.getValue()));
        }
    }

    public void modificarProducto() {
        System.out.println("Ingrese el producto que quiere modificar");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.nextLine();
        System.out.println("Ingrese el precio nuevo para el producto");
        Double precio = leer.nextDouble();
        if (this.productos.containsKey(nombre)) {
            this.productos.replace(nombre, precio);
        } else {
            System.out.println("El producto que quiere modificar no se encuentra");
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el producto que quiere eliminar");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.nextLine();

        if (this.productos.containsKey(nombre)) {
            this.productos.remove(nombre);
            System.out.println("Removido");
        } else {
            System.out.println("El producto no se encontró");
        }
        this.mostrarProductos();
    }
}
