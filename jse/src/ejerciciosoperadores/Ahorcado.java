package ejerciciosoperadores;

import java.util.Scanner;

public class Ahorcado {
	public static void main(String[] args) {
		String[] palabras = { "amor", "odio", "indiferencia", "amable" };
		int n = (int) Math.floor(Math.random() * palabras.length);
		String palabrasecreta = palabras[n];
		System.out.println(palabrasecreta);
		String palabraConGuiones = "";
		for (int i = 0; i < palabrasecreta.length(); i++) {
			palabraConGuiones = palabraConGuiones + "_";
		}
		char[] letrasPalabraSecreta = palabrasecreta.toCharArray();
		char[] letrasPalabraConGuiones = palabraConGuiones.toCharArray();
		int intentos = 0;
		boolean terminado = false;
		Scanner lector = new Scanner(System.in);

		while (!terminado) {
			intentos ++;
				
			if(intentos>9) {
				System.out.println("pudrete en las llamas del infierno");
				terminado = true;
			}else {
				System.out.println("Introduce una letra");
				String letra = lector.next();
				for (int i = 0; i < letrasPalabraSecreta.length; i++) {
			
					if (letra.charAt(0) == letrasPalabraSecreta[i]) {
						letrasPalabraConGuiones[i] = letra.charAt(0);
				
					}	
				}	
			}
			System.out.println(letrasPalabraConGuiones);

		}
	}
}
