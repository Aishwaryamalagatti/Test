package com.xworkz.ward.dto;

import com.xworkz.ward.constants.WardsName;

public class CityDTO {
	private int wardNo;
	private WardsName wardName;
	private double population;
	
	public CityDTO(int wardNo,double population) {
		this.wardNo = wardNo;
		this.population = population;

	}

	public CityDTO(int wardNo, WardsName wardName, double population) {
		super();
		this.wardNo = wardNo;
		this.wardName = wardName;
		this.population = population;
	}

	public int getWardNo() {
		return wardNo;
	}

	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}

	public WardsName getWardName() {
		return wardName;
	}

	public void setWardName(WardsName wardName) {
		this.wardName = wardName;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	

}
