package by.epam.tr.homework.lesson1;

import java.util.Scanner;

public class Task9 {

	public static void function(int[] a, int[] b, int k) {
		int res[] = new int[a.length + b.length];
		int j = 0;
		for (int i = 0; i < k; i++)
			res[j++] = a[i];
        for (int i = 0; i < b.length; i++)
        	res[j++] = b[i];
        for (int i = k; i < a.length; i++)
        	res[j++] = a[i];
        System.out.println();
        for(int i = 0; i < res.length; i++)
        	System.out.print(res[i] + " ");
	}
	
	public static void main(String[] args) {
		int  n, m, k = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers n, m, k: ");
		n = in.nextInt();
		m = in.nextInt();
		k = in.nextInt();
		in.close();
		
		int a[] = new int[n];
		int b[] = new int[m];
		
		for(int i = 0;i<a.length; i++) {
			a[i] = (int)(Math.random()*(n) + 1);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for(int i = 0;i<b.length; i++) {
			b[i] = (int)(Math.random()*(m) + 1);
			System.out.print(b[i] + " ");
		}
		
		function(a, b, k);
	}

}
