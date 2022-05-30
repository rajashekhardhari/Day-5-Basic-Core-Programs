package com.bridgelabz.basic.java.programs;

import java.util.Scanner;

public class FindQuotientAndRemainder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Dividend number:-");
		int dividend = scanner.nextInt();

		System.out.print("Enter Divisor number:-");
		int divisor = scanner.nextInt();

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("The Quotient is = " + quotient);
		System.out.println("The Remainder is = " + remainder);

	}

}
