package by.epam.tr.homework.lesson1;

import java.util.Scanner;

public class Task1 {

	public static boolean calculation(int n) {
		if (String.valueOf(Math.abs(n)).length() == 4 && (n % 10 + (n / 10) % 10) == (n / 1000 + (n / 100) % 10)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validNumber(int n) {
		if (String.valueOf(n).length() == 4 && n > 0) {
			return true;
		} else {
			System.out.println("Incorrect number! Try again:");
			return false;
		}
	}

	public static int inputNumber() {
		Scanner in = new Scanner(System.in);
		int number = 0;
		do {
			System.out.println("Enter number:");
			number = in.nextInt();
		} while (!validNumber(number));
		in.close();
		return number;
	}

	public static void main(String[] args) {
		System.out.println(calculation(inputNumber()));
	}
}