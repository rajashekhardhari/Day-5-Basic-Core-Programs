package com.bridgelabz.basic.java.programs;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter The Power Number of Two:-");
		int power = scanner.nextInt();
		int mul = 1;

		if (power >= 0 && power <= 31) {

			for (int i = 1; i <= power; i++) {
				mul = mul * 2;
				System.out.println(" 2 ^ " + " i :=" + mul);
			}

		} else {
			System.out.println("Value of number should be less than 31");
		}
	}
}
