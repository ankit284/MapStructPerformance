package com.home.mapper;

import java.util.ArrayList;

public class TestMapperPerformance {

	public static void main(String [] args) {
		ArrayList<Clothes> clothesList = LoadCSV.loadClothes();
		System.out.println(" Clothes list size ::" + clothesList.size());
		
		ArrayList<ClothesDTO> clothesDTOList = new ArrayList<ClothesDTO>(); 
	System.out.println(" Clothes list size ::" + clothesList.size());
		
		long time = System.currentTimeMillis();
		for(int i = 0; i < clothesList.size(); i++) {
			clothesDTOList.add(ClothesMapper.INSTANCE.clothesToClothesDTO(clothesList.get(i)));		
		}
		System.out.println(" ClothesDTO list size ::" + clothesDTOList.size() + " time taken :: " + (System.currentTimeMillis() - time));
	}
}
