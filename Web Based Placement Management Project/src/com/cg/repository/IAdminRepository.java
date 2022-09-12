package com.cg.repository;

import com.cg.entities.Admin;


public interface IAdminRepository 
{
	Admin addNewdetails (Admin admin);
    Admin updatedetails (Admin admin);
    Admin deletedetails  (long id);
    
    void beginTransaction();
	void commitTransaction();
    

}