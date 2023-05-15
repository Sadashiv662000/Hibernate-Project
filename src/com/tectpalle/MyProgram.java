package com.tectpalle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MyProgram {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Student s1 =new Student(101, "sadashiv", "Java");
		Student s2= new Student(102, "Khomesh", "BankingSector");
		
		s.save(s1);
		s.save(s2);
		
		t.commit();
		s.close();
		sf.close();
	}

}
