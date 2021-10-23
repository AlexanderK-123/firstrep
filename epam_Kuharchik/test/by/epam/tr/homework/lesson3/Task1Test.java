package by.epam.tr.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

public class Task1Test {
	@Test
	public void createArrayT001() {
		int x = 4;
		int[] expected = { 1, 2, 3, 4 };
		Assert.assertArrayEquals(expected, Task1.createArray(x));
	}

	@Test
	public void createArrayT002() {
		int x = 2;
		int[] expected = { 1, 2 };
		Assert.assertArrayEquals(expected, Task1.createArray(x));
	}

	@Test
	public void calcT001() {
		int[] x = { 1, 2, 3, 4, 5, 6 };
		int[] expected = { 1, 0, 3, 0, 5, 0 };
		Assert.assertArrayEquals(expected, Task1.calc(x));
	}

	@Test
	public void calcT002() {
		int[] x = { 1, 2, 3, 4 };
		int[] expected = { 1, 0, 3, 0 };
		Assert.assertArrayEquals(expected, Task1.calc(x));
	}
}
