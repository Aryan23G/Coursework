package cp213;

/**
 * Cipher class that provides methods for implementing basic shift and
 * substitution ciphers.
 * 
 * @author Aryan Gupta 169 057 546
 * @version 2024-09-01
 */
public class Cipher {
	// Constants
	public static final String ALPHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final int ALPHA_LENGTH = ALPHA.length();

	/**
	 * Encipher a string using a shift cipher. Each letter is replaced by a letter
	 * 'n' letters to the right of the original. Thus for example, all shift values
	 * evenly divisible by 26 (the length of the English alphabet) replace a letter
	 * with itself. Non-letters are left unchanged.
	 *
	 * @param s string to encipher
	 * @param n the number of letters to shift
	 * @return the enciphered string in all upper-case
	 */
	public static String shift(final String s, final int n) {
		StringBuilder result = new StringBuilder();
		int shift = n % ALPHA_LENGTH; // Handle shifts larger than 26

		for (char c : s.toUpperCase().toCharArray()) {
			if (Character.isLetter(c)) {
				int originalPos = ALPHA.indexOf(c);
				int newPos = (originalPos + shift + ALPHA_LENGTH) % ALPHA_LENGTH;
				result.append(ALPHA.charAt(newPos));
			} else {
				result.append(c);
			}
		}
		return result.toString();
	}

	/**
	 * Encipher a string using the letter positions in ciphertext. Each letter is
	 * replaced by the letter in the same ordinal position in the ciphertext.
	 * Non-letters are left unchanged. Ex:
	 *
	 * <pre>
	Alphabet:   ABCDEFGHIJKLMNOPQRSTUVWXYZ
	Ciphertext: AVIBROWNZCEFGHJKLMPQSTUXYD
	 * </pre>
	 *
	 * A is replaced by A, B by V, C by I, D by B, E by R, and so on. Non-letters
	 * are ignored.
	 *
	 * @param s          string to encipher
	 * @param ciphertext ciphertext alphabet
	 * @return the enciphered string in all upper-case
	 */
	public static String substitute(final String s, final String ciphertext) {
		StringBuilder result = new StringBuilder();

		for (char c : s.toUpperCase().toCharArray()) {
			if (Character.isLetter(c)) {
				int originalPos = ALPHA.indexOf(c);
				result.append(ciphertext.charAt(originalPos));
			} else {
				result.append(c);
			}
		}
		return result.toString();
	}
}
