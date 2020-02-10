package modificadoresacceso;

public class A {
	A(String amor, int gradoDeAmor) {
		System.out.println("estoy vivoooo!! :D");
	}

	void miMetodoA() {
		System.out.println("hola");
	}

	private void accedoAElMetodo() {
		miMetodoA();
	}

}
