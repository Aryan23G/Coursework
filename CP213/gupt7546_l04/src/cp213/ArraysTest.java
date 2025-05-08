package cp213;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Arrays Lab task methods.
 *
 * @author Aryan Gupta
 * @version 2024-10-9
 */
public class ArraysTest {

	/**
	 * Tests arrays.
	 *
	 * @param args unused default parameter
	 */
	public static void main(final String[] args) {
		System.out.println("Task 1");
		System.out.println(ArraysTest.task1());
		System.out.println("Task 2");
		System.out.println(ArraysTest.task2());
		System.out.println("Task 3");
		System.out.println(ArraysTest.task3());
		System.out.println("Task 4");
		System.out.println(ArraysTest.task4());
		System.out.println("Task 5");
		System.out.println(Arrays.toString(ArraysTest.task5()));
	}

	/**
	 * Print the contents of the arrays first and second using a standard for loop.
	 *
	 * @return true if second contains the same values as first, false otherwise
	 */
	public static boolean task1() {
		final int[] first = { 1, 3, 5, 7, 9 };
		final int[] second = first;

		System.out.println("First array:");
		for (int i = 0; i < first.length; i++) {
			System.out.print(first[i] + " ");
		}
		System.out.println();

		System.out.println("Second array:");
		for (int i = 0; i < second.length; i++) {
			System.out.print(second[i] + " ");
		}
		System.out.println();

		return Arrays.equals(first, second);
	}

	/**
	 * Double the contents of the array first with a standard for loop.
	 *
	 * @return true if second contains the same values as first, false otherwise
	 */
	public static boolean task2() {
		final int[] first = { 1, 3, 5, 7, 9 };
		final int[] second = first;

		for (int i = 0; i < first.length; i++) {
			first[i] = first[i] * 2;
		}

		return Arrays.equals(first, second);
	}

	/**
	 * Double the contents of the array first with an enhanced for loop.
	 *
	 * @return true if the values in first are permanently changed, false otherwise
	 */
	public static boolean task3() {
		final int[] first = { 1, 3, 5, 7, 9 };

		for (int i : first) {
			i = i * 2;
		}

		for (int i : first) {
			if (i % 2 != 0) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Attempt to assign the array first to a row of the 2D array third.
	 *
	 * @return true if this is allowed, false otherwise
	 */
	public static boolean task4() {
		final int[] first = { 1, 3, 5, 7, 9 };
		final int[][] third = new int[3][5]; // A 3x5 2D array

		third[0] = first;

		return Arrays.equals(third[0], first);
	}

	/**
	 * Assign the values 0 through 9 to an Integer ArrayList.
	 *
	 * @return the contents of the ArrayList as an Integer[] array.
	 */
	public static Integer[] task5() {
		final ArrayList<Integer> values = new ArrayList<>();

		for (int i = 0; i <= 9; i++) {
			values.add(i);
		}

		return values.toArray(new Integer[0]);
	}

}
