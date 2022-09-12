package com.cg.service;
import java.util.Scanner;

import com.cg.entities.Admin;
import com.cg.repository.IAdminRepository;
import com.cg.repository.IAdminRepositoryImpl;

public class IAdminServiceImpl implements IAdminService
{
	Scanner s=new Scanner(System.in);
	private IAdminRepository iar;
	
	
	public IAdminServiceImpl() {
		super();
		iar=new IAdminRepositoryImpl();
	}

	@Override
	public Admin addNewdetails(Admin admin) {
		iar.beginTransaction();
		iar.addNewdetails(admin);
		iar.commitTransaction();
		return admin;
	}

	@Override
	public Admin updatedetails(Admin admin) {
		iar.beginTransaction();
		iar.updatedetails(admin);
		iar.commitTransaction();
		return admin;
	}

	@Override
	public Admin loginpage(Admin admin) {
		System.out.println("Enter login page");
		String adminname =s.nextLine();
	
		if(adminname==admin.getName())
		{
			System.out.println("Login succesfully");
			return admin;
		}
		else
		{
			System.out.println("Somethimg Went Wrong");
			return(null);
		}
		
	
	}

	@Override
	public Admin removeuser(boolean id) {
		
		System.exit(0);
		return null;
	}
	

}