package by.epam.tr.homework.lesson1;

import java.util.Scanner;

public class Task2 {

	public static double function(double a, double b, double c) {
		return ((b + Math.sqrt(b * b + 4 * a * c)/(2 * a)) - (a * a * a * c + (1 / (b * b))));
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