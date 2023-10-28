package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Pensionatario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] quartos = new Rent [10];
		
		System.out.println("quantos quartos cadastrar ? :");
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++) {
			System.out.println("Rent :" + i);
			System.out.println("nome :");
			sc.nextLine();
			String name = sc.nextLine(); 
			System.out.println("Email :");
			String email = sc.next(); 
			System.out.println("Quarto :");
			int roomNumber = sc.nextInt();
			
			quartos[roomNumber] = new Rent(name,email);
		}
		
		
		//mostrar os quertos ocupados
		for(int i =1;i<=n;i++) {
			if(quartos[i]!= null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}
		
		
		sc.close();

	}

}
