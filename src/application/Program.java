package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data : ");
		System.out.println("name : ");
		String name = sc.nextLine();
		System.out.println("price : ");
		double price = sc.nextDouble();
		Product product = new Product(name, price);
		
		product.setName("computer");// set modificar
		System.out.println("update name" + product.getName());// get buscar
		product.setPrice(1200);
		System.out.println(product.getPrice());
		
		System.out.println();
		System.out.println("Product data : " + product);
		
		System.out.println();
		System.out.println("informe quantos produtos para cadastrar");
		int quantity = sc.nextInt(); //cria uma variavel para ver quuantos produtos entra
		product.addProducts(quantity);//adiciona os valores ao quantity
		
		System.out.println();
		System.out.println("updated data : " + product); //mostrar valor atualizado
		
		System.out.println();
		System.out.println("informe quantos produtos para retirar");
		quantity = sc.nextInt(); 
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("remover data : " + product);
		
		sc.close();
	}
}
