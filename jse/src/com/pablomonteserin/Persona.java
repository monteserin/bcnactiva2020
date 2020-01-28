package com.pablomonteserin;

import java.util.Scanner;

public class Persona {

	
	public static void main(String [] nombre) {
		Scanner lector = new Scanner (System.in);
		System.out.println("Introduce un numero:");
		int i = lector.nextInt();
		
		String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
		System.out.println("meses:"+ meses [i-1]);
		
	}

}
