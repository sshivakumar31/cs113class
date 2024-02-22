import java.util.Scanner;

public class IndexOf {
    public static int indexOf(String haystack, char needle) {
        return indexOf(haystack, needle, 0);
    }

    // Recursive method to find the index of the character in the string
    private static int indexOf(String haystack, char needle, int index) {
        if (index >= haystack.length()) {
            // Character not found
            return -1;
        }
        if (haystack.charAt(index) == needle) {
            // Character found, return its index
            return index;
        }
        // Continue searching in the rest of the string
        return indexOf(haystack, needle, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String haystack = scanner.nextLine();
        System.out.print("Enter a character to find: ");
        char needle = scanner.next().charAt(0);
        int index = indexOf(haystack, needle);
        System.out.println("Index of '" + needle + "' in the string '" + haystack + "' is: " + index);
    }
}

