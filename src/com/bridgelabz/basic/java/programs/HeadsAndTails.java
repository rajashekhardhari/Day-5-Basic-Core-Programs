package com.bridgelabz.basic.java.programs;

import java.util.Random;

public class HeadsAndTails {

	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(2);

		if (number == 1)
			System.out.println("Heads..");
		else
			System.out.println("Tails..");
	}

}
