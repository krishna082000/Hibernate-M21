package com.cg.client;

import java.time.LocalDate;

import com.cg.entities.Admin;
import com.cg.entities.Certificate;
import com.cg.entities.College;
import com.cg.entities.Placement;
import com.cg.entities.Student;
import com.cg.entities.User;
import com.cg.service.IAdminServiceImpl;
import com.cg.service.IAdminService;
import com.cg.service.IPlacementService;
import com.cg.service.IStudentService;
import com.cg.service.IPlacementServiceImpl;
import com.cg.service.IStudentServiceImpl;


public class Client 
{
	public static void main(String args[])
	{
		//Providing input for Student table
		Student student = new Student();
		IStudentService service = new IStudentServiceImpl();
	    student.setId(1063);
		student.setName("Prerana");
		student.setCollege("ICMS");
		student.setRoll(7);
		student.setQualification("BCS");
		student.setCourse("IT");
		student.setYear(2021);
		student.setHallTicketNo(121);
		
		//Providing input for Certificate table
		Certificate c=new Certificate();
		c.setId(1616);
		c.setYear(2020);
		
		//Setting methods to add certificate and student
		student.setCertificate(c);
		c.setStudent(student);
		
		//adding data including the mapped column in the table
		service.addStudent(student);
		
		//Displaying output for student table
		System.out.println("Student Id = "+student.getId());
		System.out.println("Student name = " +student.getName());
		System.out.println("Student Roll no. = "+student.getRoll());
		System.out.println("Student College = "+student.getCollege());
		System.out.println("Student Qualification Id = "+student.getQualification());
		System.out.println("Student Course = "+student.getCourse());
		System.out.println("Student Year = "+student.getCollege());
		System.out.println("Student Hall Ticket = "+student.getHallTicketNo());
		
		//Displaying output for certificate table
		System.out.println("Certificate Id = "+c.getId());
		System.out.println("Certificate Year = "+c.getYear());
		
		//Providing input for college table
		College col=new College();
		col.setId(3063);
		col.setCollegeName("Zcoer");
		col.setLocation("Pune");
		
		//Providing input for placement table
		Placement p=new Placement();
		IPlacementService placement =new IPlacementServiceImpl();
		p.setId(6026);
		LocalDate date=LocalDate.now();
		p.setDate(date);
		p.setQualification("BE");
		p.setCollege(col);
		p.setName("placement grp");
		p.setYear(2022);
		placement.addPlacement(p);
		
		//Setting methods to add college and placement 
		col.setCollegeName("NBN Sinhgad");
	    p.setCollege(col);
	    
	   //adding data including the mapped column in the table
	    placement.addPlacement(p);
	    
	    //Displaying output for college table
	    System.out.println("College Id = "+col.getId());
		System.out.println("College Name = "+col.getCollegeName());
		System.out.println("College Location = "+col.getLocation());
		
		//Displaying output for placement table
		System.out.println("Placement Id = "+p.getId());
		System.out.println("Placement Date = "+p.getDate());
		System.out.println("Placement Qualification = "+p.getQualification());
		System.out.println("Placement College = "+p.getCollege());
		System.out.println("Placement Name = "+p.getName());
		System.out.println("Placement Year = " +p.getYear());
		
		//Providing input for User table
		User u=new User();
		u.setId(4063);
		u.setName("Riya");
		u.setType("New User");
		u.setPassword("Riya@11");
		
		//Providing input for Admin table
		Admin a=new Admin();
		IAdminService ad=new IAdminServiceImpl();
	    a.setId(7063);
		a.setName(" Rahul ");
		a.setPassword("Rohit@45");
		
		//Setting methods for User and Admin table
	u.setName("Prathmesh");
	a.setName("Vipul");
	    //Adding data including the mapped column in the table
	  ad.addNewdetails(a);
	    
	    //Displaying output for User table
	    System.out.println("User ID is : " +u.getId());
		System.out.println("User Name is: "+u.getName());
		System.out.println("User Type is : "+u.getType());
		System.out.println("User Password is : "+u.getPassword());
		
		//Displaying output for admin table
		System.out.println("Admin ID is : " +a.getId());
		System.out.println("Admin Name is: "+a.getName());
		System.out.println("Admin Password is : "+a.getPassword());
	    
		
	
		System.out.println(" ");
	    System.out.println("Data is inserted");
		
		
	    
	    System.out.println(" ");
		System.out.println("Updated successfully");
		
	}

}