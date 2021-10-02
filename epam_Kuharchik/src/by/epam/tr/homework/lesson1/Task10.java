package by.epam.tr.homework.lesson1;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		int[][] a = new int[n][n];
		for(int i = 0; i < n; i++) {
			if(i % 2 != 0) {
				for(int j = 0; j < n; j++) {
					a[i][j] = ++j;
				}
			}else {
				for(int j = n; j > 0; j--) {
					a[i][j--] = n;
				}
			}	
		}
		
		for(int i = 0;i < n;i++) {
			System.out.println();
			for(int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}
}
