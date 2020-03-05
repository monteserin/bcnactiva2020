package aseguradora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainIntro {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Vehiculo vehiculo = new Vehiculo("225533G",5,4,"Saab", null);
		Vehiculo vehiculo2 = new Vehiculo("556699F",9,6,"Fiat", null);
		Vehiculo vehiculo3 = new Vehiculo("998855R",10,8,"Land rover", null);
		Vehiculo vehiculo4 = new Vehiculo("995124T",7,2,"Porsche", null);
		Vehiculo vehiculo5 = new Vehiculo("565987Y",6,9,"Ferrari", null);
		
		
		List <Siniestro> siniestros = new ArrayList<Siniestro>();
		List <Siniestro> siniestros2 = new ArrayList<Siniestro>();
		List <Siniestro> siniestros3 = new ArrayList<Siniestro>();
		List <Siniestro> siniestros4 = new ArrayList<Siniestro>();
		List <Siniestro> siniestros5 = new ArrayList<Siniestro>();
		
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		
		Date fecha = null;
		try {
			fecha = s.parse("17-01-2020");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		siniestros.add(new Siniestro(fecha,350,vehiculo));
		siniestros2.add(new Siniestro(fecha,900,vehiculo2));
		siniestros3.add(new Siniestro(fecha,800,vehiculo3));
		siniestros4.add(new Siniestro(fecha,230,vehiculo4));
		siniestros5.add(new Siniestro(fecha,100,vehiculo5));
		
		vehiculo.setSiniestros(siniestros);
		vehiculo2.setSiniestros(siniestros2);
		vehiculo3.setSiniestros(siniestros3);
		vehiculo4.setSiniestros(siniestros4);
		vehiculo5.setSiniestros(siniestros5);
	
		
		session.save(vehiculo);
		session.save(vehiculo2);
		session.save(vehiculo3);
		session.save(vehiculo4);
		session.save(vehiculo5);
		
		
		transaction.commit();
		session.close();
	}

}
