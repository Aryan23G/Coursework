/**
 * 
 */

package cp213;

import java.util.Scanner;

/*
 * Class to demonstrate the use of Scanner with a keyboard and File objects.
 *
 * @author Aryan Gupta
 * @version 2024-01-08
 */
public class ScannerTest {

	/*
	 * Count lines in the scanned file.
	 *
	 * @param source Scanner to process
	 * 
	 * @return number of lines in scanned file
	 */
	public static int countLines(final Scanner source) {
		int count = 0;

		while (source.hasNextLine()) {
			count++;
			source.nextLine();
		}

		return count;
	}

	/*
	 * Count tokens in the scanned object.
	 *
	 * @param source Scanner to process
	 * 
	 * @return number of tokens in scanned object
	 */
	public static int countTokens(final Scanner source) {
		int tokens = 0;

		while (source.hasNext()) {
			source.next();
			++tokens;
		}

		return tokens;
	}

	/*
	 * Ask for and total integers from the keyboard.
	 *
	 * @param source Scanner to process
	 * 
	 * @return total of positive integers entered from keyboard
	 */

	public static int readNumbers(final Scanner keyboard) {
		int total = 0;

		System.out.println("Enter integers to sum. Type 'q' to quit:");

		while (true) {
			// Check if the next input is an integer
			if (keyboard.hasNextInt()) {
				int number = keyboard.nextInt();
				if (number >= 0) {
					total += number; // Only add positive integers
				} else {
					System.out.println("Ignoring negative number: " + number);
				}
			} else {
				// If the input is not an integer, check if it's 'q' to quit
				String input = keyboard.next();
				if (input.equalsIgnoreCase("q")) {
					break;
				} else {
					// If the input is neither an integer nor 'q', print an error message
					System.out.println("'" + input + "' is not an integer or 'q'.");
				}
			}
		}

		return total;
	}

}