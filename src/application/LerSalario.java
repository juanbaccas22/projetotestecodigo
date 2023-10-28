package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class LerSalario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salario valor = new Salario();
		
		System.out.println("digite o nome: ");
		valor.nome = sc.nextLine();
		System.out.println("digite o salario: ");
		valor.salario = sc.nextDouble();
		System.out.println("digite o imposto: ");
		valor.imposto = sc.nextDouble();
		
		System.out.println(("nome : ") + valor.nomeCliente() + (", salario : ") + valor.proximoSalario());
		System.out.println("qual porcentagem : ");
		double porcentagem = sc.nextDouble();
		
		valor.atualizadoSalario(porcentagem);

	}

}
