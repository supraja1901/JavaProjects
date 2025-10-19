package javaProjects;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Perform basic arithmetic operations like addition, subtraction, multiplication, and division.
		Scanner sc = new Scanner(System.in);
		UsingIfElse(sc);
		UsingSwitchCase(sc);
		sc.close();
	}

	public static void UsingSwitchCase(Scanner sc) {

		System.out.print("Enter first number:");
		double num1 = sc.nextDouble();
		System.out.print("Enter Second number:");
		double num2 = sc.nextDouble();
		System.out.print("Enter an operator( + , - , * , / ):");
		char operator = sc.next().charAt(0);
		double result = 0;
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Invalid input");
				return;
			}
			break;
		default:
			System.out.println("invalid operator entered. Please select '+' or '-' or '*' or '/'");
			break;
		}
		System.out.println("The result is: " + result);
	}

	public static void UsingIfElse(Scanner sc2) {
		System.out.print("Enter first number:");
		double num1 = sc2.nextDouble();
		System.out.print("Enter Second number:");
		double num2 = sc2.nextDouble();
		System.out.print("Enter an operator( + , - , * , / ):");
		char operator = sc2.next().charAt(0);
		double result = 0;

		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Invalid input");
				return;
			}
		} else {
			System.out.println("invalid operator entered. Please select '+' or '-' or '*' or '/'");
			return;
		}
		System.out.println("The result is: " + result);

	}
}
