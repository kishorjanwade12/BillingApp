package com.billing.app.domain;

public class MyBill {
	
	int id;
	String companyName;
	String modelName;
	int ram;
	int storage;
	int availableQty;
		double price;
	int gstPercentage;
	double discount;
	double totlaPrice;
	
	
	public MyBill() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public MyBill(int id, String companyName, String modelName, int ram, int storage, int availableQty, double price,
			int gstPercentage, double discount, double totlaPrice) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.modelName = modelName;
		this.ram = ram;
		this.storage = storage;
		this.availableQty = availableQty;
		this.price = price;
		this.gstPercentage = gstPercentage;
		this.discount = discount;
		this.totlaPrice = totlaPrice;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getGstPercentage() {
		return gstPercentage;
	}
	public void setGstPercentage(int gstPercentage) {
		this.gstPercentage = gstPercentage;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getTotalPrice() {
		return totlaPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totlaPrice = totalPrice;
	}
	
	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public int getAvailableQty() {
		return availableQty;
	}

	public void setAvailableQty(int availableQty) {
		this.availableQty = availableQty;
	}


	
	
	
}
