/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.extras.java;

/**
 *
 * @author Matias
 */
public class ej2_extra {

    /**
     * @param args the command line arguments
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
     * A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C 
     * tome el valor de A, A tome el valor de D y D tome el valor de B. 
     * Mostrar los valores iniciales y los valores finales de cada variable. 
     * Utilizar sólo una variable auxiliar.

     * 
     */
    public static void main(String[] args) {
        int A,B,C,D, Auxiliar;
        A=10;
        B=20;
        C=30;
        D=40;
        System.out.println("A: "+A+" B: "+B+" C: "+C+" D: "+D);
        Auxiliar = B; 
        B=C; 
        C=Auxiliar; 
        Auxiliar = D;
        D=C;
        C = Auxiliar;
        Auxiliar = A;
        A = C;
        C = Auxiliar;
        System.out.println("A: "+A+" B: "+B+" C: "+C+" D: "+D);
        
        
        
        
    }
    
}
