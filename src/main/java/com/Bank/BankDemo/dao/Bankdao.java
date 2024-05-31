package com.Bank.BankDemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Bank.BankDemo.Entity.*;

@Repository
public class Bankdao {

	@Autowired
	SessionFactory factory;
	
	
	public String  addcounter(CashCounter cc) {
		
		Session session=factory.openSession();
		
		session.beginTransaction();
		
		session.persist(cc);
	
		session.getTransaction().commit();
		session.close();
		
		return "Cash Counter data added";
		
	}
	
	
	public String addemployee(Employee e) {
		
		Session session=factory.openSession();
		
		session.beginTransaction();
		
		session.persist(e);
		
		session.getTransaction().commit();
		session.close();
		
		return "Emplyee data added";
	
		
	}
	
	
	public String updatecount(CashCounter cc) {
		
		Session session=factory.openSession();
		
		session.beginTransaction();
		
		CashCounter counter=session.get(CashCounter.class, cc.getc_id());
		
		counter.setc_time(cc.getc_time());
		counter.setc_worker(cc.getc_worker());
		
		
		session.merge(counter);
		
		session.getTransaction().commit();
		session.close();
		
		return "counter data updated";
		
	
		
		
	}
	
	public String updateemployee(Employee e) {
		
		Session session=factory.openSession();
		
		session.beginTransaction();
		
		Employee emp=session.get(Employee.class, e.gete_id());
		
		emp.sete_name(e.gete_name());
		emp.setcounter(e.getcounter());
		
		session.merge(emp);
		
		session.getTransaction().commit();
		session.close();
		
		return "Employee data updated";
		
	
	}
	
	
	public List<CashCounter> getcounter() {
		
   Session session= factory.openSession();	
   
   session.beginTransaction();
   
   String hql="from CashCounter";
   
  Query<CashCounter> query=session.createQuery(hql,CashCounter.class);
  
  List<CashCounter> list= query.getResultList();
   
   
   
   session.getTransaction().commit();
   session.close();
		
	return list;	
		
	}
	
	
	public List<Employee> getemployee(){
		
		
		Session session=factory.openSession();
		
		session.beginTransaction();
		
		String hql="from Employee";
		
	    Query<Employee> query=session.createQuery(hql,Employee.class);
	    
	    List<Employee>list=query.getResultList();
	    
		
		session.getTransaction().commit();
		session.close();
		
		return list;
	}
	
	public String deletecc(int id) {
		
	Session session=factory.openSession();
	
	session.beginTransaction();
	
    CashCounter counter=session.get(CashCounter.class,id);
    
    session.remove(counter);
    
	session.getTransaction().commit();
	session.close();
	
	
	return "CashCounter data delete";
		
	}
	
	
	
	public String deleteemp(int id) {
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		Employee emp=session.get(Employee.class,id);
		
		session.remove(emp);
		
		session.getTransaction().commit();
		session.close();
		
		
		return "Employee data delete";
	}
	
	
	
	
	
	
	
	
}
