package by.epam.tr.homework.lesson1;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter even n:");
		int n = 0;
		do {
			n = in.nextInt();	
		}while(n % 2 != 0 || n == 0);
		in.close();
		
		int[][] a = new int[n][n];
		int k = n;
		for(int i = 0; i < n; i++) {
			if(i == 0 || i % 2 == 0) {
				for(int j = 0; j < n; j++) {
					a[i][j] = ++j;
					j--;
				} 
			}else {
				k = n;
				for(int j = 0; j < n ; j++) {
					a[i][j] = k--;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			for(int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}
}
