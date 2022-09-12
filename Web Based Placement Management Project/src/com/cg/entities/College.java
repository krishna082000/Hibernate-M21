package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
// it is used while creating class and employee entity
@Entity
@Table(name="COLLEGE")

public class College
{
	@SuppressWarnings("unused")
	private static final long SerialVersionUID=1L;
	
	@Id
	private int Id;
	//private User collegeAdmin;
	private String collegeAdmin;
	private String collegeName;
	private String location;
	
	// getters and setters method
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(String collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}