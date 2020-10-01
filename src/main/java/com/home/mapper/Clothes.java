package com.home.mapper;

public class Clothes {
	private String pogId;
	private String supc;
	private String brand;
	private String description;
	private String size;
	private String category;
	private String subCategory;
	private double price;
	private long quantity;
	private String country;
	private String sellerCode;
	private long creationtime;
	private String stock;
	
	public Clothes() {}

	public Clothes(String pogId, String supc, String brand, String description, String size, String category,
			String subCategory, double price, long quantity, String country, String sellerCode, long creationtime,
			String stock) {
		super();
		this.pogId = pogId;
		this.supc = supc;
		this.brand = brand;
		this.description = description;
		this.size = size;
		this.category = category;
		this.subCategory = subCategory;
		this.price = price;
		this.quantity = quantity;
		this.country = country;
		this.sellerCode = sellerCode;
		this.creationtime = creationtime;
		this.stock = stock;
	}

	public String getPogId() {
		return pogId;
	}

	public void setPogId(String pogId) {
		this.pogId = pogId;
	}

	public String getSupc() {
		return supc;
	}

	public void setSupc(String supc) {
		this.supc = supc;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSellerCode() {
		return sellerCode;
	}

	public void setSellerCode(String sellerCode) {
		this.sellerCode = sellerCode;
	}

	public long getCreationtime() {
		return creationtime;
	}

	public void setCreationtime(long creationtime) {
		this.creationtime = creationtime;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Clothes [pogId=" + pogId + ", supc=" + supc + ", brand=" + brand + ", description=" + description
				+ ", size=" + size + ", category=" + category + ", subCategory=" + subCategory + ", price=" + price
				+ ", quantity=" + quantity + ", country=" + country + ", sellerCode=" + sellerCode + ", creationtime="
				+ creationtime + ", stock=" + stock + "]";
	}	
}
