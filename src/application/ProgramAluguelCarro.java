package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.BrazilTaxService;
import model.entities.CarRental;
import model.entities.RentalService;
import model.entities.Vehicle;

public class ProgramAluguelCarro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro : ");
		String carModel = sc.nextLine();
		System.out.print("Modelo do carro : ");
		System.out.print("Retirada (dd/mm/yyyy  hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/mm/yyyy  hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, finish,new Vehicle(carModel));
		
		System.out.println("Entre com o preço por hora");
		double pricePerHour = sc.nextDouble();
		System.out.println("Entre com o preço por dia");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService() );
		
		rentalService.processInvoice(cr);
		
		System.out.println("Fatura:");
		System.out.println("Pagamento basico:" + cr.getInvoice().getBasicPayment());
		System.out.println("Imposto:" + cr.getInvoice().getTax());
		System.out.println("pagamento total:" + cr.getInvoice().getTotalPayment());
		
		
		
		
		
		
		sc.close();
	}

}
