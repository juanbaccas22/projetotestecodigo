package entities;

public class Employee {
	
	private String name;
	private Integer horas;
	private double valuePerHour ; 
	
	public Employee() {
	}

	public Employee(String name, Integer horas, double valuePerHour) {
		this.name = name;
		this.horas = horas;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public double payment() {
		return horas * valuePerHour;
	}
}
