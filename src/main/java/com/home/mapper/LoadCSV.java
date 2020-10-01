package com.home.mapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LoadCSV {

	public static ArrayList<Clothes> loadClothes() {
		ArrayList<Clothes> clothesList = new ArrayList<Clothes>();
		Path pathToFile = Paths.get("/Users/ankitsinghai/Downloads/products.csv");
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.ISO_8859_1)) { 
			// read the first line from the text file  
			String line = br.readLine(); 
			line = br.readLine();
			// loop until all lines are read 
			while (line != null) { 
				// use string.split to load a string array with the values from 
				// each line of the file, using a comma as the delimiter 
				String[] attributes = line.split(",");
				Clothes c = new Clothes();
				
				c.setPogId(attributes[0]);
				c.setSupc(attributes[1]);
				c.setBrand(attributes[2]);
				c.setDescription(attributes[3]);
				c.setSize(attributes[4]);
				c.setCategory(attributes[5]);
				c.setSubCategory(attributes[6]);
				c.setPrice(Double.parseDouble(attributes[7]));
				c.setQuantity(Long.parseLong(attributes[8]));
				c.setCountry(attributes[9]);
				c.setSellerCode(attributes[10]);
				c.setCreationtime(Long.parseLong(attributes[11]));
				c.setStock(attributes[12]);
				
				clothesList.add(c);
				// read next line before looping 
				// if end of file reached, line would be null				
				line = br.readLine();  
			}
		} 
		catch (IOException ioe) { 
			ioe.printStackTrace(); 
		} 
		return clothesList;
	}
}
