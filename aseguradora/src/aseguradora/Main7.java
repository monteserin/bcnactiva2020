package aseguradora;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Main7 {
 public static void main(String[] args) {
	

	Session session = HibernateUtil.getSessionFactory().openSession();
	
	Query <VehiculoSiniestro> hqlQuery2 = session.createQuery("SELECT new aseguradora.VehiculoSiniestro(v.matricula, s.perdida) FROM Vehiculo v JOIN v.siniestros s WHERE s.perdida>1000");
	

	List <VehiculoSiniestro> result1 = hqlQuery2.list();
	
	Iterator<VehiculoSiniestro> it = result1.iterator();
	
	while(it.hasNext()){
		
		VehiculoSiniestro obj =  it.next();
		
		System.out.println("Matricula: "+ obj.getMatricula());
		

	
	}
	
	
	session.close();
	
}
	
}	



