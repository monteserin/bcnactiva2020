package hibernatecolegio;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Profesor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	
	private int id;
	
	private String nombre;
	
	private String apellido;
	
	private int edad;
	
	private int anios_experiencia;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="profesor")
	
	private List <Curso> cursos;
	
	

	
	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profesor(String nombre, String apellido, int edad, int anios_experiencia, List<Curso> cursos) {
		super();
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.anios_experiencia = anios_experiencia;
		this.cursos = cursos;
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAnios_experiencia() {
		return anios_experiencia;
	}

	public void setAnios_experiencia(int anios_experiencia) {
		this.anios_experiencia = anios_experiencia;
	}


	
}
