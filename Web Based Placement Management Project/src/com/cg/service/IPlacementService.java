package com.cg.service;

import com.cg.entities.Placement;

public interface IPlacementService 
{
	Placement addPlacement(Placement placement);
	Placement updatePlacement (Placement placement);
	Placement searchPlacement (Long id);
	boolean cancelPlacement (Long id);


}