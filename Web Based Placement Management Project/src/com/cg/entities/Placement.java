package com.cg.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="placement")
@SuppressWarnings("serial")
public class Placement implements Serializable
{
	@SuppressWarnings("unused")
	private static final long SerialVersionUID=1L;
	
	@Id
	
	private Long id;
	private String name;
	private LocalDate date;
	private String qualification;
	private int year;
	
	@ManyToOne(cascade=CascadeType.ALL) // it is used for connecting placement and college table
	@JoinColumn(name="college_id")
	private College college;
	
	
	
	//getters and setters method
	public Long getId() {
		return id;
	}
	public void setId(long i) {
		this.id = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	

	

}