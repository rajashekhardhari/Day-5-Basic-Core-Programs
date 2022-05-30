package com.bridgelabz.functional.programs;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {

		double temperature, speed;

		Scanner sc = new Scanner(System.in);

		System.out.print("enter the temperature:- ");
		temperature = sc.nextDouble();

		System.out.print("enter the wind speed:-");
		speed = sc.nextDouble();

		if (temperature < 50 && speed < 120) {
			double windChillTemp = 35.74 + 0.6215 * temperature
					+ (0.4275 * temperature - 35.75) * Math.pow(speed, 0.16);
			System.out.println("temperature" + temperature);
			System.out.println("wind speed" + speed);
			System.out.println("Wind Chill Temperature is " + windChillTemp);

		} else {
			System.out.println("you have enter wrong temperature or speed");
		}
	}

}
