package by.epam.tr.homework.lesson1;

import java.util.Scanner;

public class Task3 {
	
	public static double S(double a, double b) {
		return a * b / 2;
	}
	
	public static double P(double a, double b) {
		return a + b + Math.sqrt(a * a + b * b);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers a, b: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		in.close();
		System.out.println("S = " + S(a, b) + "\nP = " + P(a, b));
	}
}