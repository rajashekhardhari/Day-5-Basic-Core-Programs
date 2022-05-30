package com.bridgelabz.basic.java.programs;

import java.util.Scanner;

public class CheckingVowelOrConsonant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Alphabet Word :- ");

		char alphabet = scanner.next().charAt(0);

		if ('A' == alphabet || 'E' == alphabet || 'I' == alphabet || 'O' == alphabet || 'U' == alphabet
				|| 'a' == alphabet || 'e' == alphabet || 'i' == alphabet || 'o' == alphabet || 'u' == alphabet)
			System.out.println("Alphabet Is Vowels..");
		else
			System.out.println("Alphabet Is Consonunts..");

	}

}
