import java.util.Random;

public class WordsLoops {

	//2.1 Method to remove letter using for loop
	public static String removeLetter(String str, char letter) {
		// Initialize an empty string to store the result
		String result = "";
		// Iterate through each character of the input string
		for (int i = 0; i < str.length(); i++) {
			// Check if the current character is not the letter to be removed
			if (str.charAt(i) != letter) {
				// If not, concatenate it to the result string
				result += str.charAt(i);
			}
		}
		// Return the resulting string
		return result;
	}



	// 2.2 while loop to remove multiple letters

	public static String removeLetters(String str, char[] letters) {
		String lettersToRemove = new String(letters);
		String result = "";
		int i = 0;
		while (i < str.length()) {
			if (lettersToRemove.indexOf(str.charAt(i)) == -1) {
				result += str.charAt(i);
			}
			i++;
		}
		return result;
	}



	// 2.3 for loop generate a random word of given length
	// TEXTBOOK PAGE 134 for random
	public static String generateRandWord(int length) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String result = "";
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(randomIndex);
			result += randomChar;
		}
		return result;
	}




	public static void main(String[] args) {
		System.out.println(removeLetter("asdfghsassaaaae", 'a'));                    System.out.println(removeLetters("asdfghsassaaaae", new char[]{'a', 's'})); 
		System.out.println(generateRandWord(8)); 
	}
}

