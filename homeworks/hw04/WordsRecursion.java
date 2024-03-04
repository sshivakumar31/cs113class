public class WordsRecursion {

	// 2.1 removeLetter
	public static String removeLetter(String str, char letter) {
		if (str.isEmpty()) {
			return "";
		} else {
			char firstChar = str.charAt(0);
			if (firstChar == letter) {
				return removeLetter(str.substring(1), letter);
			} else {
				return firstChar + removeLetter(str.substring(1), letter);
			}
		}
	}

// 2.2 removeLetters (extra credit)
    public static String removeLetters(String haystack, char[] needlesToRemove) {
        return removeLettersHelper(haystack, needlesToRemove, 0, new StringBuilder());
    }

    private static String removeLettersHelper(String haystack, char[] needlesToRemove, int index, StringBuilder result) {
        if (index >= haystack.length()) {
            return result.toString();
        }
        char currentChar = haystack.charAt(index);
        if (!contains(needlesToRemove, currentChar)) {
            result.append(currentChar);
        }
        return removeLettersHelper(haystack, needlesToRemove, index + 1, result);
    }

    private static boolean contains(char[] array, char target) {
        return containsHelper(array, target, 0);
    }

    private static boolean containsHelper(char[] array, char target, int index) {
        if (index >= array.length) {
            return false;
        }
        if (array[index] == target) {
            return true;
        }
        return containsHelper(array, target, index + 1);
    }


	// 2.3 abecedarian
	public static boolean isAbecedarian(String word) {
		if (word.length() <= 1) {
			return true;
		} else {
			return isAbecedarianHelper(word.toLowerCase(), 0);
		}
	}

	// Helper method for isAbecedarian
	private static boolean isAbecedarianHelper(String word, int index) {
		if (index >= word.length() - 1) {
			return true;
		} else {
			char currentChar = word.charAt(index);
			char nextChar = word.charAt(index + 1);
			if (currentChar > nextChar) {
				return false;
			} else {
				return isAbecedarianHelper(word, index + 1);
			}
		}
	}

	// 2.4 generateRandWord
	public static String generateRandWord(int length) {
		return generateRandWordHelper(length, "");
	}

	private static String generateRandWordHelper(int length, String word) {
		if (length == 0) {
			return word;
		} else {
			char randomChar = (char) ('a' + Math.floor(Math.random() * 26)); // Generate random character
			return generateRandWordHelper(length - 1, word + randomChar);
		}
	}

	// 2.5 Isopsephy
	// 2.5.1 isopsephy
	public static int isopsephy(String word) {
		if (word.isEmpty()) {
			return 0;
		} else {
			char currentChar = word.charAt(0);
			// Subtract 'a' ASCII value to get the letter's position in the alphabet (0-indexed)
			int letterValue = currentChar - 'a' + 1;
			return letterValue + isopsephy(word.substring(1));
		}
	}

	// 2.5.2 avgIsopsephy

	public static double avgIsopsephy(String[] words) {
		if (words.length == 0) {
			return 0.0;
		}
		return calculateAvgIsopsephy(words, 0, 0.0);
	}

	private static double calculateAvgIsopsephy(String[] words, int index, double totalIsopsephy) {
		if (index == words.length) {
			return totalIsopsephy / words.length;
		}
		return calculateAvgIsopsephy(words, index + 1, totalIsopsephy + isopsephy(words[index]));
	}

	// 2.6 Reverse String
	public static String reverseString(String str) {
		if (str.isEmpty()) {
			return str;
		} else {
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}

	// Testing methods
	public static void main(String[] args) {
		String inputStr = "asdfghsassaaaae";
		char letterToRemove = 'a';
		System.out.println("Original string: " + inputStr);
		System.out.println("String with letter '" + letterToRemove + "' removed: " + removeLetter(inputStr, letterToRemove));

		String abecedarianWord = "abdest";
		System.out.println("Is '" + abecedarianWord + "' abecedarian? " + isAbecedarian(abecedarianWord));

		int randWordLength = 5;
		System.out.println("Randomly generated word of length " + randWordLength + ": " + generateRandWord(randWordLength));

		String strToReverse = "hello";
		System.out.println("Reversed string of '" + strToReverse + "': " + reverseString(strToReverse));
	}
}



