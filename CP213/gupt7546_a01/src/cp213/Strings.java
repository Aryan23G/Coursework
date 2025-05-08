package cp213;

/**
 * @author Aryan Gupta 169 057 546
 * @version 2024-09-01
 */
public class Strings {
	// Constants
	public static final String VOWELS = "aeiouAEIOU";

	/**
	 * Determines if string is a "palindrome": a word, verse, or sentence (such as
	 * "Able was I ere I saw Elba") that reads the same backward or forward. Ignores
	 * case, spaces, digits, and punctuation in the string parameter s.
	 *
	 * @param string a string
	 * @return true if string is a palindrome, false otherwise
	 */
	public static boolean isPalindrome(final String string) {
		// Remove non-alphabetic characters and convert to lowercase.
		String cleaned = string.replaceAll("[^a-zA-Z]", "").toLowerCase();

		// Compare characters from the beginning and end of the cleaned string.
		int start = 0;
		int end = cleaned.length() - 1;

		while (start < end) {
			if (cleaned.charAt(start) != cleaned.charAt(end)) {
				return false; // If mismatch found, not a palindrome.
			}
			start++;
			end--;
		}

		return true; // No mismatches, it's a palindrome.
	}

	/**
	 * Determines if name is a valid Java variable name. Variables names must start
	 * with a letter or an underscore, but cannot be an underscore alone. The rest
	 * of the variable name may consist of letters, numbers and underscores.
	 *
	 * @param name a string to test as a Java variable name
	 * @return true if name is a valid Java variable name, false otherwise
	 */
	public static boolean isValid(final String name) {
		// Java variable names must start with a letter or an underscore but not be a
		// single underscore.
		if (name == null || name.isEmpty() || name.equals("_")) {
			return false;
		}

		// Check first character.
		char firstChar = name.charAt(0);
		if (!Character.isLetter(firstChar) && firstChar != '_') {
			return false;
		}

		// Check the rest of the string.
		for (int i = 1; i < name.length(); i++) {
			char c = name.charAt(i);
			if (!Character.isLetterOrDigit(c) && c != '_') {
				return false;
			}
		}

		return true;
	}

	/**
	 * Converts a word to Pig Latin. The conversion is:
	 * <ul>
	 * <li>if a word begins with a vowel, add "way" to the end of the word.</li>
	 * <li>if the word begins with consonants, move the leading consonants to the
	 * end of the word and add "ay" to the end of that. "y" is treated as a
	 * consonant if it is the first character in the word, and as a vowel for
	 * anywhere else in the word.</li>
	 * </ul>
	 * Preserve the case of the word - i.e. if the first character of word is
	 * upper-case, then the new first character should also be upper case.
	 *
	 * @param word The string to convert to Pig Latin
	 * @return the Pig Latin version of word
	 */
	public static String pigLatin(String word) {
		if (word == null || word.isEmpty()) {
			return word;
		}

		char firstChar = word.charAt(0);
		boolean isUpperCase = Character.isUpperCase(firstChar);
		String lowerWord = word.toLowerCase();

		if (VOWELS.indexOf(firstChar) >= 0) {
			return word + "way";
		}

		int vowelIndex = -1;
		for (int i = 1; i < lowerWord.length(); i++) {
			if (VOWELS.indexOf(lowerWord.charAt(i)) >= 0) {
				vowelIndex = i;
				break;
			}
		}

		if (vowelIndex == -1) {
			return word + "ay";
		}

		String pigLatin = lowerWord.substring(vowelIndex) + lowerWord.substring(0, vowelIndex) + "ay";

		if (isUpperCase) {
			pigLatin = pigLatin.substring(0, 1).toUpperCase() + pigLatin.substring(1);
		}

		return pigLatin;
	}
}
