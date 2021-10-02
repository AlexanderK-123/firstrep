package by.epam.tr.homework.lesson1;

import java.util.Scanner;

public class Task6 {
	
	public static double function(double a, double b, double c) {
		return Math.min(Math.min(a, b), c) + Math.max(Math.max(a, b), c);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers a, b, c: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		in.close();
		System.out.println(function(a, b, c));
	}
}