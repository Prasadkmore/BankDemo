package com.Bank.BankDemo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class CashCounter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;
	private String c_worker;
	private String c_time;
	

	
	
	public CashCounter() {
		
	}
	
	public CashCounter(String c_worker,String c_time) {
		this.c_worker=c_worker;
		this.c_time=c_time;
		
	}
	

	
	public void setc_id(int c_id) {
	
	this.c_id=c_id;
	
	}
	
	public int getc_id() {
		return c_id;
	}
	
	public void setc_worker(String c_worker) {
		this.c_worker=c_worker;
		
	}
	
	public String getc_worker() {
		return c_worker;
	}
	
	public void setc_time(String c_time) {
		this.c_time=c_time;
	}
	public String getc_time() {
		return c_time;
	}
	

	@Override
	public String toString() {
		return "CashCounter [c_id=" + c_id + ", c_worker=" + c_worker + ", c_time=" + c_time +"]";
	}
	
	

}
