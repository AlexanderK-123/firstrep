package by.epam.tr.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

public class Task2Test {
	@Test
	public void calcT001() {
		int[] x = { 1, 2, 3, 4 };
		int[][] expected = { { 1, 2, 3 }, { 1, 4, 9 }, { 1, 8, 27 } };
		Assert.assertArrayEquals(expected, Task2.calc(x));
	}

	@Test
	public void calcT002() {
		int[] x = { 1, 2, 3, 4, 5 };
		int[][] expected = { { 1, 2, 3, 4, 5 }, { 1, 4, 9, 16, 25 }, { 1, 8, 27, 64, 125 }, { 1, 16, 81, 256, 625 },
				{ 1, 32, 243, 1024, 3125 } };
		Assert.assertArrayEquals(expected, Task2.calc(x));
	}
}
