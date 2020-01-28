package ejerciciosoperadores;

import java.util.Scanner;

public class Main2_Conversor {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int euros = lector.nextInt();
		int dolares = euros * 2;
		
		System.out.println(dolares);
	}
}
