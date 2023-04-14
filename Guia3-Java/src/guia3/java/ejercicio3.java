/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.java;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una frase de 8 caracteres");
       String frase = leer.nextLine();
       if(frase.length()==8){
           System.out.println("La frase tiene 8 caracteres, es correcta");          
       }else{
           System.out.println("La frase tiene "+frase.length()+" caracteres, es incorrecta");
       }
    }
    
}
