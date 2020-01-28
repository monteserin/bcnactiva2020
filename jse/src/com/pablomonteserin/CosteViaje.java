package com.pablomonteserin;

import java.util.Scanner;

public class CosteViaje {

		public static void main (String [] args){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Introduzca el numero de noches: ");
			int numNoches = scanner.nextInt();
			System.out.println("Introduzca el destino: ");
			String destino = scanner.next();
			
			CosteViaje costeViaje = new CosteViaje();
			int resultado1 = costeViaje.costeHotel(numNoches);
			int resultado2 = costeViaje.costeAvion(destino);
			int resultado3 = costeViaje.costeAlquilerCoche(numNoches);

			int sumaCostes = resultado1 + resultado2 + resultado3;
			System.out.println("Coste total: " + sumaCostes);
		}
		
		public int costeHotel (int numN) {
			int costeH = numN * 140;
			return costeH;
		}
		
		public int costeAvion (String dest) {
			if (dest.equals("Oviedo")) {
				return 15;
			}else if(dest.equals("Tokyo")) {
				return 700;
			}else if(dest.equals("Madrid")) {
				return 90;
			}else if(dest.equals("Barcelona")) {
				return 90;
			}return 0;
		}
		
		public int costeAlquilerCoche (int numN) {
			int costeC = numN * 40;
			if ( numN>=7 ) {
				return costeC -50;
			}
			else if ( numN>=3 ) {
				return costeC -20;
			}return costeC;
		}
}



