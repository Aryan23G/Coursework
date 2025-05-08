package cp213;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * A class to validate and process serial numbers.
 * 
 * @author Aryan Gupta 169 057 546
 * @version 2024-09-01
 */
public class SerialNumber {

	/**
	 * Determines if a string contains all digits.
	 *
	 * @param str The string to test.
	 * @return true if str is all digits, false otherwise.
	 */
	public static boolean allDigits(final String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}

		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Determines if a string is a valid serial number. Good serial numbers are of
	 * the form 'SN/nnnn-nnn', where 'n' is a digit.
	 *
	 * @param sn The serial number to test.
	 * @return true if the serial number is valid in form, false otherwise.
	 */
	public static boolean validSn(final String sn) {
		if (sn == null) {
			return false;
		}

		// Regex to check for the pattern 'SN/nnnn-nnn', where n is a digit
		return sn.matches("SN/\\d{4}-\\d{3}");
	}

	/**
	 * Evaluates serial numbers from a file. Writes valid serial numbers to goodSns,
	 * and invalid serial numbers to badSns. Each line of fileIn contains a
	 * (possibly valid) serial number.
	 *
	 * @param fileIn  A file already open for reading.
	 * @param goodSns A file already open for writing valid serial numbers.
	 * @param badSns  A file already open for writing invalid serial numbers.
	 */
	public static void validSnFile(final Scanner fileIn, final PrintStream goodSns, final PrintStream badSns) {
		while (fileIn.hasNextLine()) {
			String serialNumber = fileIn.nextLine().trim();

			if (validSn(serialNumber)) {
				goodSns.println(serialNumber);
			} else {
				badSns.println(serialNumber);
			}
		}
	}

}
