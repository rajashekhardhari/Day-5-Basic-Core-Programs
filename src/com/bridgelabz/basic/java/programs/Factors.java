package com.bridgelabz.basic.java.programs;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:-");
		int number = scanner.nextInt();
		boolean isPrime = true;

		for (int i = 1; i < number / 2; i++) {
			if (number % 2 == 0) {
				isPrime = false;
				break;
			}
			if (isPrime == true)
				System.out.println(number + "is prime");
			else
				System.out.println(number + "is not a prime");

		}
	}

}
