package deposito;

public class Deposito {
	private String nombre;
	private int alto;
	private int largo;
	private int ancho;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	
	public void sayHello(String rqr) {
		
	}
	@Override
	public boolean equals(Object obj) {
		if( !(obj instanceof Deposito))return false;
		Deposito deposito = (Deposito) obj;
		return(alto*ancho*largo == deposito.getAlto()*deposito.getAncho()*deposito.getLargo());	
	}
	
	
}
