package com.cg.service;

import com.cg.entities.Certificate;
import com.cg.repository.ICertificateRepositoryImpl;
import com.cg.repository.ICertificateRepository;

public class ICertificateServiceImpl implements ICertificateService
{
	// Step1: Establishing connection between service and repository
	private ICertificateRepository cao;
	
	//constructor
	public ICertificateServiceImpl() 
	{
		super();
		cao =new ICertificateRepositoryImpl();
	}

	// Step 2: Service calls to perform CRUD Operation

	@Override
	public Certificate addCertificate(Certificate certificate) 
	{
		cao.beginTransaction();
		cao.addCertificate(certificate);
		cao.commitTransaction();	
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) 
	{
		cao.beginTransaction();
		cao.updateCertificate(certificate);
		cao.commitTransaction();	
		return certificate;
	}

	@Override
	public Certificate searchCertificate(long id) 
	{
		Certificate certificate =cao.searchCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(long id) 
	{
		cao.beginTransaction();
		Certificate certificate = cao.deleteCertificate(id);
		cao.commitTransaction();	
		return certificate;
	}
}