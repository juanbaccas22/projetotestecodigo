package entities;

public class Salario {

	public String nome;
	public double salario;
	public double imposto;
	public double porcentagem;
	
	public String nomeCliente () {
		return nome;
	}
	
	public double proximoSalario() {
		return salario-imposto;
	}
	
	public void atualizadoSalario(double porcentagem) {
	    salario += salario * porcentagem /100;
	}
	
	
	
}
