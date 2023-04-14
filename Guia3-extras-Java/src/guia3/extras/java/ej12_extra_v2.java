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
public class ej12_extra_v2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

			String unidad;
			String decena;
			String centena;
		
		for(int i = 0; i<10; i++) {
			
			for (int j = 0; j<10; j++) {
				
				for (int k = 0; k<10; k++) {
					if(i == 3) {
						centena = "E";
					}
					else {
						centena = String.valueOf(i);
					}
					if(j == 3) {
						decena = "E";
					}
					else {
						 decena = String.valueOf(j);
					}
					if(k == 3) {
						unidad = "E";
					}
					else {
						unidad = String.valueOf(k);
					}
					
					System.out.println(centena+"-" + decena+"-"+ unidad);
				}
				
			}
		}

	}

}
