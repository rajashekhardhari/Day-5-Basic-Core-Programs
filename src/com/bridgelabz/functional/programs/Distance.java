package com.bridgelabz.functional.programs;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the four integers Numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		int number4 = sc.nextInt();
		int totalNumber = display(number1, number2, number3, number4);
		System.out.print(totalNumber);
	}

        static int display(int number1, int number2, int number3, int number4) {
		long q = (int) Math.round(Math.sqrt(number1 * number2 + number3 * number4));
		System.out.println(q);
		return (int) q;

	}
       
}
