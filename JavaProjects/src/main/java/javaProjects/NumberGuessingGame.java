package javaProjects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("Guess a number between 1 and 100.");

		UsingForLoop(sc, randomNumber);
//		UsingWhileLoop(sc, randomNumber);
		sc.close();
	}

	public static void UsingWhileLoop(Scanner sc, int randomNumber) {
		int guess = 0;
		while (guess != randomNumber) {
			System.out.print("Enter your guess: ");
			guess = sc.nextInt();
			if (guess < randomNumber) {
				System.out.println("Too Low!");
			} else if (guess > randomNumber) {
				System.out.println("Too High!");
			} else {
				System.out.println("Correct! You have guessed the number.");
			}
		}
	}

	public static void UsingForLoop(Scanner sc, int randomNumber) {
		int MaxAttempts = 10;
		for (int i = 0; i <= MaxAttempts; i++) {
			System.out.print("Enter your guess: ");
			int guess = sc.nextInt();
			if (guess < randomNumber) {
				System.out.println("Too Low!");
			} else if (guess > randomNumber) {
				System.out.println("Too High!");
			} else {
				System.out.println("Correct! You have guessed the number.");
				return;
			}
			if (i == MaxAttempts) {
				System.out.println("Sorry, you've run out of attempts. The number was: " + randomNumber);
			}
		}
	}

}
