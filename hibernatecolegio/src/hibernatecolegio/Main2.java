package hibernatecolegio;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import hibernatecolegio.HibernateUtil;


public class Main2 {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Query <Profesor> hqlQuery2 = session.createQuery("SELECT p FROM Profesor p ORDER BY edad");
		
		List <Profesor> result1 = hqlQuery2.list();
		
		Iterator<Profesor> it = result1.iterator();
		while(it.hasNext()){
			Profesor obj =  it.next();				 
			System.out.println("Nombre: "+ obj.getNombre());
			System.out.println("Edad: "+ obj.getEdad());

		
		}
		
		
		session.close();
		
	}
	

	}


