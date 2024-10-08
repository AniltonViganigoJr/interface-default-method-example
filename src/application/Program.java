package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.BrazilInterestService;
import model.services.InterestService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount:");
		double amount = sc.nextDouble();
		System.out.print("Months:");
		int months = sc.nextInt();
		
		InterestService interest = new BrazilInterestService(2.0);
		
		System.out.printf("\n***Payment after %d months***",months);
		System.out.println("\n$" + String.format("%.2f", interest.payment(amount, months)));
		
		
		sc.close();
	}

}
