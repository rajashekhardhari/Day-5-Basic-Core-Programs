package com.bridgelabz.basic.java.programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Four Digit Year:-");
		int year = scanner.nextInt();

		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
			System.out.println("Lear Year");
		else
			System.out.println("Not leap Year");

	}

}
