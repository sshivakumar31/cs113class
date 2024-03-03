public class ArraysRecursion {

	// 3.1.2 isPalindrome characters

	public static boolean isPalindrome(char[] word) {
		return isPalindromeHelper(word, 0, word.length - 1);
	}

	private static boolean isPalindromeHelper(char[] word, int start, int end) {
		if (start >= end) {
			return true;
		}
		if (word[start] != word[end]) {
			return false;
		}
		return isPalindromeHelper(word, start + 1, end - 1);
	}

	// 3.1.3 isPalindrome integers

	public static boolean isPalindrome(int[] arr) {
		return isPalindromeHelper(arr, 0, arr.length - 1);
	}

	private static boolean isPalindromeHelper(int[] arr, int start, int end) {
		if (start >= end) {
			return true;
		}
		if (arr[start] != arr[end]) {
			return false;
		}
		return isPalindromeHelper(arr, start + 1, end - 1);
	}

	// 3.2 Sorted

	public static boolean isSorted(int[] arr, boolean ascending) {
		return isSortedHelper(arr, 0, ascending);
	}

	private static boolean isSortedHelper(int[] arr, int index, boolean ascending) {
		if (index >= arr.length - 1) {
			return true;
		}
		if (ascending) {
			if (arr[index] > arr[index + 1]) {
				return false;
			}
		} else {
			if (arr[index] < arr[index + 1]) {
				return false;
			}
		}
		return isSortedHelper(arr, index + 1, ascending);
	}

	public static void main(String[] args) {
		// Test methods here
		char[] word1 = {'m', 'a', 'd', 'a', 'm'};
		char[] word2 = {'a', 'b', 'c', 'd'};
		System.out.println("Is 'madam' a palindrome? " + isPalindrome(word1));
		System.out.println("Is 'abcd' a palindrome? " + isPalindrome(word2));
		// Test isPalindrome method for integers
		int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
		int[] arr2 = {1, 2, 3, 4, 5};
		System.out.println("Is {1, 2, 3, 4, 3, 2, 1} a palindrome? " + isPalindrome(arr1));
		System.out.println("Is {1, 2, 3, 4, 5} a palindrome? " + isPalindrome(arr2));

		// Test isSorted method
		int[] arr3 = {1, 2, 3, 4, 5};
		int[] arr4 = {5, 4, 3, 2, 1};
		System.out.println("Is {1, 2, 3, 4, 5} sorted in ascending order? " + isSorted(arr3, true));
		System.out.println("Is {5, 4, 3, 2, 1} sorted in ascending order? " + isSorted(arr4, true));
		System.out.println("Is {5, 4, 3, 2, 1} sorted in descending order? " + isSorted(arr4, false));
	}
}

