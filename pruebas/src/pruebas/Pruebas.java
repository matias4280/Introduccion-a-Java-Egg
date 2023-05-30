/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Matias
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
       for(int i = 2; i<=128; i*=2){
           cont = cont+1;
       }
        System.out.println(cont);
    }
    
}
