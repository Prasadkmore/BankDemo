package com.Bank.BankDemo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int e_id;
	String e_name;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "c_id")
	private CashCounter counter;
	
	public void setcounter(CashCounter counter) {
		
		this.counter=counter;
	}
	public CashCounter getcounter() {
		
		return counter;
	}
	
	public Employee() {
		
	}
	public Employee(String e_name) {
		
		this.e_name=e_name;
	}
	
	public void sete_id(int e_id) {
		this.e_id=e_id;
	}
	public int gete_id() {
		return e_id;
	}
	
	public void sete_name(String e_name) {
		
		this.e_name=e_name;
	}
	public String gete_name() {
		return e_name;
	}
	
	@Override
	public String toString() {
		
		return "Employee [e_id="+e_id+",e_name="+e_name+" counter="+counter+"]";
	}
	
	
}
