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
public class ej12_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		
		for (int i = 0; i<1000; i++) {
			if(i<=9) {
				String numero = String.valueOf(i);
				if(numero.equals("3")) {
					System.out.println("0"+"-"+"0"+"-"+"E");
				}
				else {
					System.out.println("0"+"-"+"0"+"-"+numero);
				}
			}else {
				if(i<=99) {
					String numero = String.valueOf(i); 
						
						if(numero.substring(0,1).equals("3") && numero.substring(1,2).equals("3")){
							System.out.println("0"+"-"+"E"+"-"+"E");
							}
						else {
							if(numero.substring(0,1).equals("3")) {
								System.out.println("0"+"-"+"E"+"-"+numero.substring(1,2));
							
							}else {
								if(numero.substring(1,2).equals("3")){
									System.out.println("0"+"-"+numero.substring(0,1)+"-"+"E");
									}
								else {
									System.out.println("0"+"-"+numero.substring(0,1)+"-"+numero.substring(1,2));
									}
							}	
					}
				}
				else {
					if(i<=999) {
							String numero = String.valueOf(i); 
							String centena = numero.substring(0,1);
							String decena = numero.substring(1,2);
							String unidad = numero.substring(2,3);
							if(unidad.equals("3") && decena.equals("3") && centena.equals("3")) {
								System.out.println("E"+"-"+"E"+"-"+"E");
							}
								else {
									if(unidad.equals("3") && decena.equals("3")) {
										System.out.println(centena+"-"+"E"+"-"+"E");
									}
									else {
										if(centena.equals("3") && decena.equals("3")){
											System.out.println("E"+"-"+"E"+"-"+unidad);
										}
										else {
											if(centena.equals("3") && unidad.equals("3")) {
												System.out.println("E"+"-"+decena+"-"+"E");
											}
										
											else {
												if(decena.equals("3")){
													System.out.println(centena+"-"+"E"+"-"+unidad);
												}
												else {
													if(centena.equals("3")){
														System.out.println("E"+"-"+decena+"-"+unidad);
													}
													else {
														if(unidad.equals("3")){
															System.out.println(centena+"-"+decena+"-"+"E");
														}
														else {
															System.out.println(centena+"-"+decena+"-"+unidad);
														}
													}
												}
											}
										
								}
							}
							
						}
					}
				}
			}
		}
	}
}
