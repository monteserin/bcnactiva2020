package ejerciciosoperadores;

import java.util.Scanner;

public class EjercicioTablaMultiplicar {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce el numero");	
		double r = 1;
		
		for(double n = lector.nextInt() ; n>1; n--) {
			r = r*n;
		}
		
		System.out.println(r);

	}

}
