public class RecursiveArray {

// Sum of Numbers

// Recursive method signature 
    public static int sumArray(int[] numbers) {
        return sumArray(numbers, 0);
    }


    public static int sumArray(int[] numbers, int index) {

        if (index == numbers.length) {
            return 0;
        }

        return numbers[index] + sumArray(numbers, index + 1);
    }


// Product of numbers

    public static int product(int[] numbers) {
        return product(numbers, 0);
    }

    public static int product(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index];
        }
        return numbers[index] * product(numbers, index + 1);
    }

// Keep letters
    public static String keepLetters(char[] chars) {
        return keepLetters(chars, 0, "");
    }

    public static String keepLetters(char[] chars, int index, String result) {
        if (index == chars.length) {
            return result;
        }
        if ((chars[index] >= 'a' && chars[index] <= 'z') || (chars[index] >= 'A' && chars[index] <= 'Z')) {
            result += chars[index];
        }
        return keepLetters(chars, index + 1, result);
    }


    public static void main(String[] args) {

        int[] testArray1 = {1, 2, 3};
        System.out.printf("sumArray() returns %d, should be %d\n", sumArray(testArray1), 6);

        int[] testArray2 = {4, 5, 6};
        System.out.printf("sumArray() returns %d, should be %d\n", sumArray(testArray2), 15);

        int[] testArray3 = {};
        System.out.printf("sumArray() returns %d, should be %d\n", sumArray(testArray3), 0);

        int[] testArray4 = {2, 3, 4};
        System.out.printf("sumArray() returns %d, should be %d\n", sumArray(testArray4), 9);

        int[] testArray5 = {2, 2, 2, 2};
        System.out.printf("sumArray() returns %d, should be %d\n", sumArray(testArray5), 8);

        int[] testArray6 = {1, 9, 8, 0, 2};
        System.out.printf("sumArray() returns %d, should be %d\n", sumArray(testArray6), 20);

        int[] testArray7 = {0, 0, 0, 2, 0};
        System.out.printf("sumArray() returns %d, should be %d\n", sumArray(testArray7), 2);

// Product of numbers
        int[] productTest1 = {1, 2, 3, 4};
        System.out.printf("product() returns %d, should be %d\n", product(productTest1), 24);

        int[] productTest2 = {4};
        System.out.printf("product() returns %d, should be %d\n", product(productTest2), 4);

// Keep Letters
        char[] keepLettersTest = {'1', '2', 'A', '3', 'a', '4'};
        System.out.printf("keepLetters() returns %s, should be %s\n", keepLetters(keepLettersTest), "Aa");
    }
}

