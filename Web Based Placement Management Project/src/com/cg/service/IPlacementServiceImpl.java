package com.cg.service;

import com.cg.entities.Placement;
import com.cg.repository.IPlacementRepository;
import com.cg.repository.IPlacementRepositoryImpl;

public class IPlacementServiceImpl implements IPlacementService {

	private IPlacementRepository ipl;
	
	

	public IPlacementServiceImpl() {
		super();
		ipl = new IPlacementRepositoryImpl();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		ipl.beginTransaction();
		ipl.addPlacement(placement);
		ipl.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		ipl.beginTransaction();
		ipl.updatePlacement(placement);
		ipl.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(Long id) {
		Placement placement=ipl.searchPlacement(id);
		return placement;
	}

	@Override
	public boolean cancelPlacement(Long id) {
		ipl.beginTransaction();
		ipl.cancelPlacement(id);
		ipl.commitTransaction();
		return false;
	}

}