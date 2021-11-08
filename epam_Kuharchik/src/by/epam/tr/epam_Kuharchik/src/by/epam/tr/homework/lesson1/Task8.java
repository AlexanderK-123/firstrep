package by.epam.tr.homework.lesson1;

import java.util.Scanner;

public class Task8 {

	public static int function(int[] a, int k) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] % k == 0) {
				sum += a[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n, k = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers n, k: ");
		n = in.nextInt();
		k = in.nextInt();
		in.close();
		
		int a[] = new int[n];
		
		for(int i = 0;i<a.length; i++) {
			a[i] = (int)(Math.random()*(n) + 1);
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\n" + function(a, k));
	}
}
