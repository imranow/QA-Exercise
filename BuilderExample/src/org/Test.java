package org;

public class Test {

	public static void main(String[] args) {
		Product t1 = new ProductBuilder()
				.name("TV")
				.buildProduct();
		
		Product obj2 = new ProductBuilder()
				.id(101)
				.name("TV")
				.brand("devops")
				.price(123)
				.BuildProduct()
				
				Product obj3 = new ProductBuilder()
				.name("tv")
				.brand("devops")
				.BuildProduct()
	}
}
