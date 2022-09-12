package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.Admin;

public class IAdminRepositoryImpl implements IAdminRepository
{

	private EntityManager em1;
	
	
	public IAdminRepositoryImpl() {
		super();
		em1= JPAUtil.getEntityManager();
	}

	@Override
	public Admin addNewdetails(Admin admin) {
		em1.persist(admin);
		return admin;
	}

	@Override
	public Admin updatedetails(Admin admin) {
		em1.merge(admin);
		return admin;
	}

	@Override
	public Admin deletedetails(long id) {
		em1.remove(id);
		return null;
	}

	@Override
	public void beginTransaction() {
		em1.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		em1.getTransaction().commit();
		
	}

}