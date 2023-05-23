/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.java;

import Servicios.PruebaServicio;
import Entidades.Prueba;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Matias
 */
public class mainPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
      PruebaServicio PS = new PruebaServicio();
      
      Prueba entidad = PS.crearEntidadPrueba();
     
        System.out.println(entidad.toString());
         Prueba entidad2 = PS.crearEntidadPrueba();
        System.out.println(entidad2.toString());
        System.out.println(entidad.toString());
         */
        Date myDate = new Date();

        System.out.println(new SimpleDateFormat("dddd 'de' MMMM 'de' yyyy").format(myDate));

        
      
    }
    
}
