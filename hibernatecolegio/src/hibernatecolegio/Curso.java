package hibernatecolegio;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Curso {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	
	private String nombre;
	
	private Date fecha_inicio;
	
	private int precio;
	
	@ManyToOne
	private Profesor profesor;
	
	

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(String nombre, Date fecha_inicio, int precio, Profesor profesor) {
		super();
		
		this.nombre = nombre;
		this.fecha_inicio = fecha_inicio;
		this.precio = precio;
		this.profesor = profesor;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
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

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
