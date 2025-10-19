package javaProjects;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		UsingSwitchCase(sc);
		UsingIfElse(sc);
		sc.close();
	}

	public static void UsingSwitchCase(Scanner sc) {

		System.out.print("Enter the amount:");
		double amount = sc.nextDouble();
		System.out.print("Enter the currency to convert from (USD, EUR, INR): ");
		String fromCurrency = sc.next().toUpperCase();
		System.out.print("Enter the currency to convert to (USD, EUR, INR): ");
		String toCurrency = sc.next().toUpperCase();
		double conversionRate = 0;
		switch (fromCurrency) {
		case "INR": {
			switch (toCurrency) {
			case "INR":
				conversionRate = 1;
				break;
			case "USD":
				conversionRate = 1;
				break;
			case "EUR":
				conversionRate = 1;
				break;
			default:
				System.out.println("Invalid target currency");
				return;
			}
			break;
		}
		case "USD": {
			switch (toCurrency) {
			case "INR":
				conversionRate = 1;
				break;
			case "USD":
				conversionRate = 1;
				break;
			case "EUR":
				conversionRate = 1;
				break;
			default:
				System.out.println("Invalid target currency");
				return;
			}
			break;
		}
		case "EUR": {
			switch (toCurrency) {
			case "INR":
				conversionRate = 1;
				break;
			case "USD":
				conversionRate = 1;
				break;
			case "EUR":
				conversionRate = 1;
				break;
			default:
				System.out.println("Invalid target currency");
				return;
			}
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + fromCurrency);
		}

		double convertedAmount = amount * conversionRate;
		// Output the converted amount
		System.out.println("Converted amount: " + convertedAmount + " " + toCurrency);
	}

	public static void UsingIfElse(Scanner sc) {

		System.out.print("Enter the amount:");
		double amount = sc.nextDouble();
		System.out.print("Enter the currency to convert from (USD, EUR, INR): ");
		String fromCurrency = sc.next().toUpperCase();
		System.out.print("Enter the currency to convert to (USD, EUR, INR): ");
		String toCurrency = sc.next().toUpperCase();
		double conversionRate = 0;
		if (fromCurrency.equals("INR") && toCurrency.equals("INR")) {
			conversionRate = 1;
		} else if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
			conversionRate = 1;
		} else if (fromCurrency.equals("INR") && toCurrency.equals("EUR")) {
			conversionRate = 1;
		} else if (fromCurrency.equals("USD") && toCurrency.equals("USD")) {
			conversionRate = 1;
		} else if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
			conversionRate = 1;
		} else if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
			conversionRate = 1;
		} else if (fromCurrency.equals("EUR") && toCurrency.equals("EUR")) {
			conversionRate = 1;
		} else if (fromCurrency.equals("EUR") && toCurrency.equals("INR")) {
			conversionRate = 1;
		} else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
			conversionRate = 1;
		} else {
			System.out.println("Invalid conversion");
			return;
		}

		double convertedAmount = amount * conversionRate;
		System.out.println("Converted amount: " + convertedAmount + " " + toCurrency);
	}

}
