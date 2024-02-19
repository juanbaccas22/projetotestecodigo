package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program161 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> list = new ArrayList<>();
		
		System.out.println("qual quantidade de funcionarios ?");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n; i++) {
			System.out.println("funcionario " + i + "data");
			System.out.print("O funcionario é terceirizado ? (Y/N)");
			char ch = sc.next().charAt(0);
			System.out.print("Name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("quantidade de horas : ");
			int horas = sc.nextInt();
			System.out.print("valor por horas: ");
			double valuePerHour = sc.nextDouble();
			if(ch == 'y') {
				System.out.print("taxa adicional: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, horas, valuePerHour, additionalCharge));
			}
			else {
				list.add(new Employee(name, horas, valuePerHour));
			}
			
			
		}
		
		System.out.println();
		System.out.println("Payments :");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.payment()));
		}
		
		
		
		sc.close(); 
	}

}
