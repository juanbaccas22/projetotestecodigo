package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Programteste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle qualquerVariavel = new Rectangle();
		
		System.out.println("digite a base e altura a seguir : ");
		qualquerVariavel.Width = sc.nextDouble();
		qualquerVariavel.Height = sc.nextDouble();
		
		System.out.println(qualquerVariavel.area());
		System.out.println(qualquerVariavel.perimetro());
		

	}

}
