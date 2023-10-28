package entities;

public class Product {

	private String name; // atributo
	private double price;
	private int quantity;

	public Product() {
	}

	// criando o construtor
	public Product(String name, double price, int quantity) { // (parametro) , depois ele recebe os atributos no
																// parametro
		this.name = name; // this é para se referir ao atributo, o 2 name é para parametro
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStoke() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $" + String.format(" %.2f", price) // formatar para 2 casas decimais, ou ter colocado price só
				+ ", " + quantity + " units , total : $ " + String.format("%.2f", totalValueInStoke()); // mesma coisa
																										// era só
																										// colocar
																										// totalValueInStoke()
	}

}
