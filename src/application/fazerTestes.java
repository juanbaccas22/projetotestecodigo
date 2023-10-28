package application;

import java.util.Locale;
import java.util.Scanner;

public class fazerTestes {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double [] vect = new double [n]; //vetor para saber quantas posições
		 
		for (int i=0 ; i<n ; i++) {
			vect [i]= sc.nextDouble(); // vetor esta na variavel i
		}
		
		double sum =0;
		for (int i=0; i<n; i++) {
			sum += vect[i]; //soma o valor da variavel soma + valor digitado
		}
	
		double avg = sum / n ;
		System.out.println(avg);
		
		
		
		sc.close();
	}

}
