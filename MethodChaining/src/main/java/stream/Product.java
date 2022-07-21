package stream;

public class Product {
	public int prodID;
	public String name;
	public float price;
	public int quantity;
	public String brand;
	public float deliveryCharges;
	public Product(int prodID, String name, float price, int quantity, String brand, float deliveryCharges) {
		super();
		this.prodID = prodID;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		this.deliveryCharges = deliveryCharges;
	}
	@Override
	public String toString() {
		return "Product [prodID=" + prodID + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", brand=" + brand + ", deliveryCharges=" + deliveryCharges + "]";
	}
	

}
