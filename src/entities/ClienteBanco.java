package entities;

public class ClienteBanco {
	
	public String Nome;
	private int numeroConta;
	public double deposito;
	public int taxa;
	
	public ClienteBanco (String nome,int numeroConta, double deposito) {
		this.Nome = nome;
		this.numeroConta = numeroConta;
		this.deposito = deposito;
	}
	
	
	
	public void addVAlores(double deposito) {
		this.deposito += deposito;
	}
	
	public void retirarValores(double deposito) {
		this.deposito -= deposito - taxa;
	}
	
	
	
	
	
	public String toString() {
		return (" nome : ") + Nome + (" || conta :  ") + numeroConta + (" || valor em conta :  ") + deposito ;
		
	}

}
