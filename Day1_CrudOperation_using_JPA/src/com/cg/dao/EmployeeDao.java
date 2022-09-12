package com.cg.dao;

import com.cg.entities.Employee;

public interface EmployeeDao
{
	public abstract void addEmployee(Employee emp); //creation
	public abstract void updateEmployee(Employee emp);  //updation 
	
	public abstract Employee  getEmployeeId(int id); 
	
	void removeEmployee(Employee emp); //delete 
	
	public abstract void commitTransaction(); // close an entity manager 
	
	public abstract	void beginTransaction(); // begin the operation of entity Manager 
	
	
}