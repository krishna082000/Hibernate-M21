package com.cg.client;


import com.cg.entities.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImpl;

public class client {

	public static void main(String[] args)
	{
		EmployeeService es= new EmployeeServiceImpl();
		Employee emp=new Employee();
		
		//create operation 
		emp.setID(1001);
		emp.setName("ram");
		es.addEmployee(emp);
		
		// Retrieve data 
		
		/*Emp=es.getEmployeeId(1001);
		System.out.println("Emp ID:"+emp.getId());
		System.out.println("Emp Name:"+emp.getName());*/
		
		//update the recored 
		//emp=es.getEmployeeId(1001);
		//emp.setName("sanket");
		//es.updateEmployee(emp);
		
		//we have updated the recore after the selection 
		
		/*emp=es.getEmployeeId(1001);
		System.out.println("Emp ID:"+emp.getId());
		System.out.println("Emp Name:"+emp.getName());*/
		
		// at this brealpoint ,record is removed 
		//emp=es.getEmployeeId(1001);
		//es.removeEmployee(emp);
		//System.out.println("End of program /Life cycle completed.....");
		
		}
	}