package com.cg.service;

import com.cg.entities.Admin;


public interface IAdminService
{
     Admin addNewdetails (Admin admin);
     Admin updatedetails (Admin admin);
     Admin loginpage(Admin admin);
     Admin removeuser(boolean id);


}