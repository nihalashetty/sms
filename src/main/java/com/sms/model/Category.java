package com.sms.model;

public class Category {
	private int categoryId;
	private String categoryName;
	private int categoryManufacturingPrice;
	private int categoryTotalEarnings;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getCategoryManufacturingPrice() {
		return categoryManufacturingPrice;
	}
	public void setCategoryManufacturingPrice(int categoryManufacturingPrice) {
		this.categoryManufacturingPrice = categoryManufacturingPrice;
	}
	public int getCategoryTotalEarnings() {
		return categoryTotalEarnings;
	}
	public void setCategoryTotalEarnings(int categoryTotalEarnings) {
		this.categoryTotalEarnings = categoryTotalEarnings;
	}
}
