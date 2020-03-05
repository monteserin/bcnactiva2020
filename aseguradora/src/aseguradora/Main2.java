package aseguradora;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Main2 {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Query <Vehiculo> hqlQuery2 = session.createQuery("SELECT v FROM Vehiculo v ORDER BY ruedas");
		
		List <Vehiculo> result1 = hqlQuery2.list();
		
		Iterator<Vehiculo> it = result1.iterator();
		while(it.hasNext()){
			Vehiculo obj =  it.next();				 
			System.out.println("Matricula: "+ obj.getMatricula());
			System.out.println("Marca: "+ obj.getMarca());

		
		}
		
		
		session.close();
		
	}
	
	

}
