package hibernatecolegio;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Main4 {
	
	public static void main(String[] args) {
		
	Session session = HibernateUtil.getSessionFactory().openSession();
	
	Query <Profesor> hqlQuery2 = session.createQuery("FROM Profesor WHERE edad>30 OR anios_experiencia>5");

	List <Profesor> result1 = hqlQuery2.list();
	
	Iterator<Profesor> it = result1.iterator();
	while(it.hasNext()){
		Profesor obj =  it.next();				 
		System.out.println("Nombre "+ obj.getNombre());
		

	
	}
	
	
	session.close();
	
	}
}

