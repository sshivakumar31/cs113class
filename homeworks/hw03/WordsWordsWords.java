public class WordsWordsWords {

	public static boolean isAbecedarian(String word) {
		if (word.length() != 6) {
			return false;
		}

		word = word.toLowerCase();

		return word.charAt(0) <= word.charAt(1) && word.charAt(1) <= word.charAt(2) && word.charAt(2) <= word.charAt(3) && word.charAt(3) <= word.charAt(4) && word.charAt(4) <= word.charAt(5);

	}

	// 1.2 doubloon

	public static boolean isDoubloon(String word) {
		if (word.length() != 6) {
			return false;
		}
		word = word.toLowerCase();
		if (!word.matches("[a-j]{6}")) { 
			return false;
		}

		int[] counts = new int[26];

		// counts for each character
		counts[word.charAt(0) - 'a'] = counts[word.charAt(0) - 'a'] + 1;
		counts[word.charAt(1) - 'a'] = counts[word.charAt(1) - 'a'] + 1;
		counts[word.charAt(2) - 'a'] = counts[word.charAt(2) - 'a'] + 1;
		counts[word.charAt(3) - 'a'] = counts[word.charAt(3) - 'a'] + 1;
		counts[word.charAt(4) - 'a'] = counts[word.charAt(4) - 'a'] + 1;
		counts[word.charAt(5) - 'a'] = counts[word.charAt(5) - 'a'] + 1;

		// check if all counts are equal to 2
		return counts[word.charAt(0) - 'a'] == 2 &&
			counts[word.charAt(1) - 'a'] == 2 &&
			counts[word.charAt(2) - 'a'] == 2 &&
			counts[word.charAt(3) - 'a'] == 2 &&
			counts[word.charAt(4) - 'a'] == 2 &&
			counts[word.charAt(5) - 'a'] == 2;
	}

	// 1.3 Isopsephy

	public static double avgIsopsephy(String word1, String word2, String word3) {

		if (word1.length() != 4 || word2.length() != 4 || word3.length() != 4) {
			return -1;
		}

		int isopsephy1 = calculateIsopsephy(word1);
		int isopsephy2 = calculateIsopsephy(word2);
		int isopsephy3 = calculateIsopsephy(word3);

		double totalIsopsephy = isopsephy1 + isopsephy2 + isopsephy3;

		return totalIsopsephy / 3;
	}


	public static boolean isopsephySumEqual(String word1, String word2) {

		if (word1.length() != 4 || word2.length() != 4) {
			return false;
		}

		int sum1 = calculateIsopsephy(word1);
		int sum2 = calculateIsopsephy(word2);
		return sum1 == sum2;

	}

	// Helper Method

	private static int calculateIsopsephy(String word) {
		word = word.toLowerCase();

		word = word.replaceAll("[^a-z]", "");

			int isoSum = word.length() * ('j' - 'a' + 1);

		return isoSum;
	}

// 1.4 reverseString

	public static String reverseString(String str) {
		if (str.length() != 5) {
			return ""; 
		}
		char[] reversedChars = new char[5];
		reversedChars[0] = str.charAt(4);
		reversedChars[1] = str.charAt(3);
		reversedChars[2] = str.charAt(2);
		reversedChars[3] = str.charAt(1);
		reversedChars[4] = str.charAt(0);
		return new String(reversedChars);
	}

	public static void main(String[] args) {
		System.out.println(isAbecedarian("abdest")); 
		System.out.println(isAbecedarian("456789")); 


		System.out.println(isDoubloon("Abba")); 
		System.out.println(isDoubloon("123456")); 

		String str1 = "abcd";
		String str2 = "efgh";
		String str3 = "ijkl";

		double averageIsopsephy = avgIsopsephy(str1, str2, str3);
		System.out.println("Average Isopsephy: " + averageIsopsephy);

		boolean isEqual = isopsephySumEqual(str1, str2);
		System.out.println("Isopsephy sums are equal: " + isEqual);

		String reversedString = reverseString("hello");
		System.out.println("Reversed String: " + reversedString);
	}
}

