package aseguradora;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Main6 {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Query <Vehiculo> hqlQuery2 = session.createQuery("SELECT v FROM Vehiculo v JOIN v.siniestros s WHERE s.perdida>1000");
		
	
		List <Vehiculo> result1 = hqlQuery2.list();
		
		Iterator<Vehiculo> it = result1.iterator();
		while(it.hasNext()){
			Vehiculo obj =  it.next();				 
			System.out.println("Matricula: "+ obj.getMatricula());
			

		
		}
		
		
		session.close();
		
	}

	}


