package com.cg.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity// to create class 
@Table(name="employee")//
public class Employee implements Serializable 
{
	private static final long SerialVersionUID=1L;//comman line after serializable
	@Id //due to primary key need annotation
	private int ID;
	private String Name;
	// getter and setter method 
	public int getID() 
	{
		return ID;
	}
	public void setID(int iD) 
	{
		ID = iD;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}

}
