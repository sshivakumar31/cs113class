public class ArraysLoops {

	public static void main(String[] args) {
		char[] palindrome1 = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};
		char[] palindrome2 = {'a', 'b', 'c', 'd', 'c', 'b', 'a'};
		char[] notPalindrome = {'h', 'e', 'l', 'l', 'o'};

		System.out.println(isPalindrome(palindrome1));         System.out.println(isPalindrome(palindrome2));         System.out.println(isPalindrome(notPalindrome)); 
	}  

	public static boolean isPalindrome(char[] array) {
		if (array.length == 0) {
			return true;
		}

		int start = 0;
		int end = array.length - 1;

		for (int i = 0; i < array.length / 2; i++) {
			if (array[start + i] != array[end - i]) {
				return false; 
			}
		}

		return true; 
	}

	// 3.2 last index of a specific integer in an array
	public static int locationOf(int[] array, int target) {
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == target)
				return i;
		}
		return -1; 

	}
}

