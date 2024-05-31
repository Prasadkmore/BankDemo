package com.Bank.BankDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.BankDemo.Entity.CashCounter;
import com.Bank.BankDemo.Entity.Employee;
import com.Bank.BankDemo.Service.Bankservice;

@RestController
@RequestMapping("/Bank")
public class Bankcontroller {

	@Autowired
	Bankservice bs;
	
	@PostMapping("/addcount")
	public String  addcountrcon(@RequestBody  CashCounter cc) {
    String msg=bs.addcounterservice(cc);
    return msg;
	}
	
	@PostMapping("/addemp")
	public String addemployee(@RequestBody  Employee e) {
		
		String msg=bs.addemployee(e);
		
		return msg;
	}
	
	@PutMapping("/upcc")
	public String updatecc(@RequestBody  CashCounter cc) {
		
		String msg=bs.updatecc(cc);
		
		return msg;
	}
	
	@PutMapping("/upemp")
	public String updateemp(@RequestBody   Employee e) {
		
		String msg=bs.updateemp(e);
		
		return msg;
	}
	
	
	@GetMapping("/getcc")
	public List<CashCounter> getcc(){
		
		List<CashCounter>list=bs.getcc();
		return list;
	}
	
	@GetMapping("/getemp")
	public List<Employee> getemp(){
		
		List<Employee> list=bs.getemp();
		
	    return list;
			
	}
	
	@DeleteMapping("/delcc/{id}")
	public String deletecc(@RequestHeader int id) {
		
		String msg=bs.deletecc(id);
		return msg;
	}
	
	@DeleteMapping("/delemp/{id}")     //can't delete counter direct first delete which is access the employee than delete counter.
	public String deleteemp( @RequestHeader  int id) {
		String msg=bs.deleteemp(id);
		return msg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
