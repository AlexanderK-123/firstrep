package by.epam.tr.homework.lesson3;

public class Task2 {
	public static void showDoubleArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int[][] calc(int[] a) {
		int[][] b = new int[a.length][a.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = (int) Math.pow(a[j], i + 1);
			}
		}
		return b;
	}

	public static void main(String[] args) {
		Task1.showArray(Task1.createArray(5));
		showDoubleArray(calc(Task1.createArray(5)));
	}
}
