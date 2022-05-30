package com.bridgelabz.basic.java.programs;

import java.util.Scanner;

public class FindLargerNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Number:-");
		int firstNumber = scanner.nextInt();

		System.out.print("Enter Second Number:-");
		int secondNumber = scanner.nextInt();

		System.out.print("Enter Third Number:-");
		int thirdNumber = scanner.nextInt();

		if (firstNumber >= secondNumber && firstNumber >= thirdNumber)
			System.out.println("First Number is Greater");
		else if (secondNumber >= firstNumber && secondNumber >= thirdNumber)
			System.out.println("Second Number is Greater");
		else
			System.out.println("Third Number is Greater");
	}

}
