package com.bridgelabz.basic.java.programs;

import java.util.Scanner;

public class SwappingTheNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Number:-");
		int firstNumber = scanner.nextInt();

		System.out.print("Enter Second Number:- ");
		int secondNumber = scanner.nextInt();

		System.out.println(" Before Swapping ");
		System.out.println("First Number:= " + firstNumber + " Second Number:= " + secondNumber);

		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;

		System.out.println(" After Swapping");
		System.out.println("First Number:= " + firstNumber + " Second Number= " + secondNumber);

	}

}
