package by.epam.tr.homework.lesson1;

import java.util.Scanner;

public class Task1 {
	public static boolean function(int n) {
		if(String.valueOf(Math.abs(n)).length() == 4 && (n%10+(n/10)%10) == (n/1000 + (n/100)%10)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = in.nextInt();
		in.close();
		System.out.println(function(number));
	}
}