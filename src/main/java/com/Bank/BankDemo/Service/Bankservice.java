package com.Bank.BankDemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.BankDemo.Entity.CashCounter;
import com.Bank.BankDemo.Entity.Employee;
import com.Bank.BankDemo.dao.Bankdao;

import ch.qos.logback.core.model.conditional.ElseModel;

@Service
public class Bankservice {

	@Autowired
	Bankdao bd;
	
	
	public String  addcounterservice(CashCounter cc) {
		String msg=bd.addcounter(cc);
		return msg;
	}
	
	
	public String addemployee(Employee e) {
		
		String msg=bd.addemployee(e);
		
		return msg;
	}
	
	public String updatecc(CashCounter cc) {
		
		String msg=bd.updatecount(cc);
		
		return msg;
	}
	
	public String updateemp(Employee e) {
		
		String msg=bd.updateemployee(e);
		
		return msg;
	}
	
	public List<CashCounter> getcc(){
		
		List<CashCounter> list=bd.getcounter();
		
		return list;
	}
	
	public List<Employee> getemp(){
		
		List<Employee> list=bd.getemployee();
		
		return list;
	}
	
	
	public String deletecc(int id) {
		
	String msg=	bd.deletecc(id);
	
	return msg;
	}
	
	public String deleteemp(int id) {
		
		String msg=bd.deleteemp(id);
		return msg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
