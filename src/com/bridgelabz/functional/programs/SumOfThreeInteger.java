package com.bridgelabz.functional.programs;

public class SumOfThreeInteger {

	static void findTriplets(int[] arr, int number) {

		boolean found = false;
		for (int i = 0; i < number - 2; i++) {
			for (int j = i + 1; j < number - 1; j++) {
				for (int k = j + 1; k < number; k++) {

					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.print(arr[i]);

						System.out.print(" ");

						System.out.print(arr[j]);

						System.out.print(" ");

						System.out.print(arr[k]);

						System.out.print("\n");

						found = true;
					}
				}
			}
		}

		if (!found)
			System.out.println(" not exist ");

	}

	public static void main(String[] args) {
		int[] arr = { 0, -1, 2, -3, 1 };
		int n = arr.length;
		findTriplets(arr, n);

	}

}
