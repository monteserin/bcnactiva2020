package hibernatecolegio;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Main7 {
 public static void main(String[] args) {
	

	Session session = HibernateUtil.getSessionFactory().openSession();
	
	Query <ProfesorCurso> hqlQuery2 = session.createQuery("SELECT new hibernatecolegio.ProfesorCurso(p.nombre, c.precio) FROM Profesor p JOIN p.cursos c WHERE c.precio>500");
	

	List <ProfesorCurso> result1 = hqlQuery2.list();
	
	Iterator<ProfesorCurso> it = result1.iterator();
	
	while(it.hasNext()){
		
		ProfesorCurso obj =  it.next();
		
		System.out.println("El nombre de el profesor es: "+ obj.getNombreProfesor());
		System.out.println("Precio superior a 500: "+ obj.getCurso());
		

	
	}
	
	
	session.close();
	
}
	
}	
