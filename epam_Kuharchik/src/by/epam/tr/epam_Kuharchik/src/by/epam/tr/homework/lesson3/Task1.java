package by.epam.tr.homework.lesson3;

public class Task1 {
	public static int[] createArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}
		return a;
	}

	public static int[] calc(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				a[i] = 0;
			}
		}
		return a;
	}

	public static void showArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		showArray(createArray(2));
		showArray(calc(createArray(6)));
	}

}
