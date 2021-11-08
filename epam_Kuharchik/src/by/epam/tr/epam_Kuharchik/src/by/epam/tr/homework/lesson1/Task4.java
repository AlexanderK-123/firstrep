package by.epam.tr.homework.lesson1;

import java.util.Scanner;

public class Task4 {
	
	public static boolean function(double x, double y) {
		if(y > 0 && y <= 4 && x >= -2 && x <= 2) {
			return true;
		}else if(y <= 0 && y >= -3 && x >= -4 && x <= 4) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x, y: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		in.close();
		System.out.println(function(x,y));
	}
}
