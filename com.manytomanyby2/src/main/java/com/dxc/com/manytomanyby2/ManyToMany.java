package com.dxc.com.manytomanyby2;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 class ManyToMany {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		LocalDate date = LocalDate.of(2020, 6, 7);
		Meeting meet = new Meeting(11,"monthly team meeting,date", date);
		
		LocalDate date1 = LocalDate.of(2020, 6, 7);
		Meeting meet2 = new Meeting(7,"weekly team meeting,date", date1 );
		
		
		Employee emp1 = new Employee(101,"ram","krishna");
		Employee emp2 = new Employee(103,"jyothi","sharma");
		Employee emp3 = new Employee(105,"prema","rakshi");
		
		emp1.getMeetings().add(meet);
		emp1.getMeetings().add(meet2);
		
		emp2.getMeetings().add(meet);
		
	    emp3.getMeetings().add(meet2);
	    emp3.getMeetings().add(meet);
	    
	    session.persist(emp1); 
	    session.persist(emp2);
	    session.persist(emp3);
	    
	    trans.commit();
	    session.close();

	}

}
