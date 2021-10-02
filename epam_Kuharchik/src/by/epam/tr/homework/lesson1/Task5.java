package by.epam.tr.homework.lesson1;

import java.util.Scanner;

public class Task5 {

	public static double function(double n) {
		if(n < 0) {
			return Math.pow(n, 4);
		}else {
			return Math.pow(n, 2);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num[] = new double[3]; 
		System.out.println("Enter numbers a, b, c: ");
		num[0] = in.nextDouble();
		num[1] = in.nextDouble();
		num[2] = in.nextDouble();
		in.close();
		for(int i = 0; i < num.length; i++) {
			System.out.println(function(num[i]));
		}
	}
}