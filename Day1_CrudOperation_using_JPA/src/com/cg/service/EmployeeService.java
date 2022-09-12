package com.cg.service;

import com.cg.entities.Employee;

public interface EmployeeService
{
		public abstract void addEmployee(Employee emp); //creation

		public abstract void updateEmployee(Employee emp);  //updation 
	

		public abstract Employee  getEmployeeId(int id); //Retrieve 
	

		public abstract void removeEmployee(Employee emp); //delete 
	
}