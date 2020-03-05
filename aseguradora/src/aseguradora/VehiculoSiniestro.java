package aseguradora;

public class VehiculoSiniestro {

	private String matricula;
	
	private int perdida;


	public VehiculoSiniestro(String matricula, int perdida) {
		super();
		this.matricula = matricula;
		this.perdida = perdida;
	}

	public VehiculoSiniestro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPerdida() {
		return perdida;
	}

	public void setPerdida(int perdida) {
		this.perdida = perdida;
	}

	
	
}
