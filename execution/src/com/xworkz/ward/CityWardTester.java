package com.xworkz.ward;

import com.xworkz.ward.constants.WardsName;
import com.xworkz.ward.dto.CityDTO;
import com.xworkz.wardInfo.CityWards;

public class CityWardTester {
	public static void main(String[] args) {
		
		CityWards cityWards=new CityWards();
		cityWards.displayInfo("Mr.Patil", 4050);
		System.out.println(cityWards.getCorporatorName());
		System.out.println(cityWards.getArea());
		
		CityWards cityWards2=new CityWards();
		cityWards2.storing(234, 60000, WardsName.VIDYANAGAR);
		System.out.println(cityWards2.getArea());
		System.out.println(cityWards2.getPopulation());
		System.out.println(cityWards2.getWardName());
		
		CityDTO cityDTO=new CityDTO(212 ,WardsName.RAJAJINAGAR, 4567);
		System.out.println("ward no is:"+cityDTO.getWardNo());
		System.out.println("ward population is::"+cityDTO.getPopulation());
		System.out.println("ward name is::"+cityDTO.getWardName());

	}

}
