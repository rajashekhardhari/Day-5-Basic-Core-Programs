package com.bridgelabz.functional.programs;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

	static void arrayOperations() {
		Scanner scanner = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);

		System.out.print("Enter the Rows of the MATRIX:- ");
		int rows = scanner.nextInt();
		System.out.print("Enter the Column of the MATRIX:- ");
		int column = scanner.nextInt();

		int[][] array = new int[rows][column];

		System.out.println("Enter array elements: ");

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < column; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		scanner.close();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				writer.print(array[i][j] + " ");

			}
			writer.println();
		}
		writer.close();
	}

	public static void main(String[] args) {
		arrayOperations();

	}

}
