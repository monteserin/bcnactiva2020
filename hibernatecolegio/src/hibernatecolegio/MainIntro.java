package hibernatecolegio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;	

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernatecolegio.HibernateUtil;
import hibernatecolegio.Curso;
import hibernatecolegio.Profesor;

public class MainIntro {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Profesor profesor = new Profesor ("Marcos","Garcia",22,5, null);
		Profesor profesor2 = new Profesor ("Pablo","Gonzalez",33,6,null);
		Profesor profesor3 = new Profesor ("Juan","Romero",55,15,null);
		Profesor profesor4 = new Profesor ("Francisco","Fernandez",26,10,null);
		Profesor profesor5 = new Profesor ("Cristobal","Diaz",23,10,null);
	
		
		
		List <Curso> curso = new ArrayList<Curso>();
		List <Curso> curso1 = new ArrayList<Curso>();
		List <Curso> curso2 = new ArrayList<Curso>();
		List <Curso> curso3 = new ArrayList<Curso>();
		List <Curso> curso4 = new ArrayList<Curso>();
	
		
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		
		Date fecha = null;
		try {
			fecha = s.parse("17-01-2020");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		curso.add(new Curso("Mates",fecha,200,profesor));
		curso1.add(new Curso("Natus",fecha,300,profesor2));
		curso2.add(new Curso("Reli",fecha,400,profesor3));
		curso3.add(new Curso("Socis",fecha,500,profesor4));
		curso4.add(new Curso("C",fecha,660,profesor5));
		
		profesor.setCursos(curso);
		profesor2.setCursos(curso1);
		profesor3.setCursos(curso2);
		profesor4.setCursos(curso3);
		profesor5.setCursos(curso4);
	
		
		session.save(profesor);
		session.save(profesor2);
		session.save(profesor3);
		session.save(profesor4);
		session.save(profesor5);
		
		
		transaction.commit();
		session.close();
	}

	}


