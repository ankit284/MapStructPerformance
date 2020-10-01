package com.home.mapper;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;

public class TestBeanUtilsPerformance {

	public static void main(String[] args) {
		ArrayList<Clothes> clothesList = LoadCSV.loadClothes();
		System.out.println(" Clothes list size ::" + clothesList.size());
		
		ArrayList<ClothesDTO> clothesDTOList = new ArrayList<ClothesDTO>(); 
		for(int i = 0; i < clothesList.size(); i++) {
			clothesDTOList.add(new ClothesDTO());
		}
		System.out.println(" Clothes list size ::" + clothesList.size());
		
		long time = System.currentTimeMillis();
		for(int i = 0; i < clothesList.size(); i++) {
			BeanUtils.copyProperties(clothesList.get(i), clothesDTOList.get(i) );
		}
		System.out.println(" ClothesDTO list size ::" + clothesDTOList.size() + " time taken :: " + (System.currentTimeMillis() - time));

	}
}
