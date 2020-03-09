package hibernatecolegio;

public class ProfesorCurso {

	private int curso;
	
	private String nombreProfesor;

	
	
	public ProfesorCurso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfesorCurso(String nombreProfesor,int curso) {
		super();
		this.curso = curso;
		this.nombreProfesor = nombreProfesor;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getNombreProfesor() {
		return nombreProfesor;
	}

	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}


	
	
	
}
