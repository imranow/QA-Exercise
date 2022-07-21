package org;

public class ProductBuilder {
	
	public ProductBuilder(){}
	private int id;
	private String name;
	private String brand;
	private int price;
	
	public Builder BuildProduct() {
		return new Builder(name, age, price);
	}
	
	public ProductBuilder name(String passedName) {
		this.name = passedName;
		return this;
	}
	public ProductBuilder brand(String passedBrand) {
		this.brand = passedBrand;
		return this;
	}
	public ProductBuilder price(int passedPrice) {
		this.price = passedPrice;
		return this;
	}
	public ProductBuilder id(int passedId) {
		this.id = passedId;
		return this;
	}
}
