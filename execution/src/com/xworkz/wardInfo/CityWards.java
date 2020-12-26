package com.xworkz.wardInfo;

import com.xworkz.ward.constants.WardsName;
import com.xworkz.ward.dto.*;

public class CityWards {
	private int wardN0;
	private WardsName wardName;
	private String CorporatorName;
	private double population;
	private int area;
	private CityDTO cityDTO;
	
	public void storing(int wardN0,double population,WardsName wardName) {
		this.wardN0=wardN0;
		this.population=population;
		this.wardName=wardName;
	}
		
	
	


	public void displayInfo(String CorporatorName,int area)
	{
		System.out.println("displaying the ward information");
		this.CorporatorName=CorporatorName;
		this.area=area;
	}
	
	
	public String getCorporatorName() {
		return CorporatorName;
	}

	public void setCorporatorName(String corporatorName) {
		CorporatorName = corporatorName;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public CityDTO getCityDTO() {
		return cityDTO;
	}

	public void setCityDTO(CityDTO cityDTO) {
		this.cityDTO = cityDTO;
	}
	public int getWardN0() {
		return wardN0;
	}


	public void setWardN0(int wardN0) {
		this.wardN0 = wardN0;
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
	
	
	
	//public void wardInfo(WardsName wardName) {
		//if(wardName!=null) {
			//this.cityDTO
			//is.cityDTO.getName();
			
			
		
	}
	
	
	


