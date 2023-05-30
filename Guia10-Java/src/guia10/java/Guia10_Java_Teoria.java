/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.java;

import java.util.*;

/**
 *
 * @author Matias
 */
public class Guia10_Java_Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer;
        leer = new Scanner(System.in);
        /** Array<int> listado = new ArrayList;
        TreeSet<String> = TreeSet();
        HashMap<Integer> personas = new HashMap<>;*/
        
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> arbol = new TreeSet();
        HashMap<Integer,String> personas = new HashMap();
        
        //LISTAS
         ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x);
        
        //CONJUNTOS
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 50;
        numerosB.add(y);
        
        //MAPAS
        HashMap<Integer,String> alumnos = new HashMap();
        int dni = 47865345;
        String nombreAlumno = "Pablo";
        alumnos.put(dni, nombreAlumno);
        
        for(int i = 0; i<3; i++){
            System.out.println("agregue un elemento a la lista numerosA");
            x = leer.nextInt();
            numerosA.add(x);
            System.out.println("Agregue un elemento a la lista numerosB");
            y = leer.nextInt();
            numerosB.add(y);

            System.out.println("Agregue un dni al hashMap alumnos");
            
            dni = leer.nextInt();
            leer.nextLine();
            System.out.println("Agregue un nombre al hashMap alumnos");
            nombreAlumno = leer.nextLine();
           
            alumnos.put(dni, nombreAlumno);
        }
        //Recorro las coleccionEs para imprimir los elementos
        for(Integer nA: numerosA){
            System.out.print(" "+nA+" ");
        }
        System.out.println("");
        for(Integer nB: numerosB){
            System.out.print(" "+nB+" ");
        }
        System.out.println("");
        
        for(Map.Entry<Integer,String> entry: alumnos.entrySet()){
            System.out.println("documento: "+entry.getKey()+" de: "+entry.getValue());
        }
        
        //ELIMINAR ELEMENTOS
        Integer num  = 10;
 
        numerosA.remove(num);
    
        for(Integer nA: numerosA){
            System.out.print(" "+nA+" ");
        }
    }
    
}
