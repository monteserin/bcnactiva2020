package encapsulamiento;

public class Persona {
	private int edad = 37;

	public int getEdad() {
		
		return ++edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
