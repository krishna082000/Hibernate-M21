package com.cg.repository;
import com.cg.entities.Placement;

public interface IPlacementRepository 
{
	Placement addPlacement (Placement placement);
	Placement updatePlacement(Placement placement);
	Placement searchPlacement(Long id);
	void beginTransaction();
	void commitTransaction();
    Boolean cancelPlacement(Long id);


}