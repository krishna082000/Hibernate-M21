package com.cg.service;

	import java.util.Scanner;

	import com.cg.entities.User;
	import com.cg.repository.IUserRepository;
	import com.cg.repository.IUserRepositoryImpl;

	public class IUserServiceImpl implements IUserService

	{
		Scanner s=new Scanner(System.in);
		private IUserRepository resp;
		

		public IUserServiceImpl() {
			super();
			resp=new IUserRepositoryImpl ();
		}

		@Override
		public User addNewUser(User user) {
			resp.beginTransaction();
			resp.addNewUser(user);
			resp.commitTransaction();
			return user;
		}

		@Override
		public User updateUser(User user) {
			
			resp.beginTransaction();
			resp.updateUser(user);
			resp.commitTransaction();
			return user;

		}

		@Override
		public User login(User user) 
		{
			System.out.println("Enter username");
			String username =s.nextLine();
			System.out.println("Enter password");
			String password=s.nextLine();
			if(username==user.getName() && password==user.getPassword())
			{
				System.out.println("Login succesfully");
				return user;
			}
			else
			{
				System.out.println("Invalid username and password");
				return(null);
			}
			
			
			
			
		}

		@Override
		public User logout(boolean user) 
		{
			System.exit(0);
	        return null;
		}
		

	}

