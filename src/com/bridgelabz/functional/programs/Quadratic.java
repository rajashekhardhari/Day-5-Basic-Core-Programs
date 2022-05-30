package com.bridgelabz.functional.programs;

import java.util.Scanner;

public class Quadratic {

	public static double number1, number2, number3, delta, root1, root2;

	public static void QuadraticRoots() {
		System.out.println("Enter the values of number1,number2 & number3 :- ");
		Scanner sc = new Scanner(System.in);
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
		delta = ((Math.pow(number2, 2)) - (4 * number1 * number3));
		System.out.println(delta);
		if (delta > 0) {
			root1 = (double) ((-number2 + Math.sqrt(delta)) / (2 * number1));
			root2 = (double) ((-number2 + Math.sqrt(delta)) / (2 * number1));
			System.out.println(" Roots of the Equation ax^2+bx+c : ");
			System.out.println("Root1 = " + root1 + " Root2 = " + root2);
		} else
			System.out.println("Imaginary roots have entered");
		sc.close();
	}

	public static void main(String[] args) {

		QuadraticRoots(); // calling method
	}

}
