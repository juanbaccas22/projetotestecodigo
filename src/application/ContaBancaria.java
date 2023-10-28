package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ClienteBanco;

public class ContaBancaria {
 
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Bem vindo ao cadastro do banco");
		System.out.println("informe seu nome :");
		String nome = sc.nextLine();
		System.out.println("informe numero conta 4 digitos :");
		int numeroConta = sc.nextInt();
		double deposito = 0;
		
		ClienteBanco cliente = new ClienteBanco(nome, numeroConta, deposito);
		
		System.out.println("deseja adicionar deposito ao criar conta : (1 sim ou 2 não) ?  :");
		int escolha = sc.nextInt();
		
		if(escolha == 1) {
			System.out.println("digite os valores inicial para depositar :");
			deposito = sc.nextDouble();
			cliente.addVAlores(deposito);
		}
		
		System.out.println(cliente);
		System.out.println("digite valor deposito : ");
		deposito = sc.nextDouble();
		cliente.addVAlores(deposito);
		System.out.println("Dados atualizados :" + cliente);
		
		System.out.println("Valor para saque: (5R$ taxa) ");
		deposito = sc.nextDouble();
		cliente.taxa = -5;
		cliente.retirarValores(deposito);
		System.out.println("Dados atualizados :" + cliente);
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
