package javaProjects;

import java.util.Scanner;

public class UnitConverter {
	static double convertedValue = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		double value = sc.nextInt();
		System.out.print("Enter the unit type(Length or Temperature or Weight): ");
		String unitType = sc.next().toLowerCase();
		System.out.print("Enter the unit to convert from: ");
		String fromUnit = sc.next().toLowerCase();
		System.out.print("Enter the unit to convert to: ");
		String toUnit = sc.next().toLowerCase();
		UsingifElse(value, unitType, fromUnit, toUnit);
		sc.close();

	}

	public static void UsingSwitchCase(double value, String unitType, String fromUnit, String toUnit) {
		switch (unitType) {
		case "length":
			switch (fromUnit) {
			case "kilometers":
				if (toUnit.equals("miles")) {
					convertedValue = value * 0.621371;
				} else {
					System.out.println("Invalid length conversion.");
					return;
				}
				break;
			}
		}

	}

	public static void UsingifElse(double value, String unitType, String fromUnit, String toUnit) {
		if (unitType.equals("length")) {
			if (fromUnit.equals("miles") && toUnit.equals("kilometers")) {
				convertedValue = value * 1.60934;
			} else if (fromUnit.equals("kilometers") && toUnit.equals("miles")) {
				convertedValue = value * 0.621371;
			} else {
				System.out.println("Invalid conversion");
				return;
			}
		} else if (unitType.equals("temperature")) {
			if (fromUnit.equals("celsius") && toUnit.equals("farenhiet")) {
				convertedValue = (value * 9 / 5) + 32;
			} else if (fromUnit.equals("farenhiet") && toUnit.equals("celsius")) {
				convertedValue = (value - 32) * 5 / 9;
			} else {
				System.out.println("Invalid conversion");
				return;
			}
		} else if (unitType.equals("weight")) {
			if (fromUnit.equals("kilograms") && toUnit.equals("pounds")) {
				convertedValue = value * 2.20462;
			} else if (fromUnit.equals("pounds") && toUnit.equals("kilograms")) {
				convertedValue = value * 0.453592;
			} else {
				System.out.println("Invalid conversion");
				return;
			}
		} else {
			System.out.println("Invalid type");
			return;
		}
		System.out.println("Converted value: " + convertedValue + toUnit);
	}

}
