package com.bridgelabz.basic.java.programs;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the harmonic number you want to find:-");
		int number1 = scanner.nextInt();

		double result = 0;
		double number = 0;

		for (int i = 1; i <= number1; i++) {
			number = number + ((double) 1 / i);
			result = number;
		}
		System.out.println("The value of Harmonic no. " + number1 + " is:- " + result);

	}

}
