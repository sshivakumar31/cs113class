public class NumbersRecursion {

	// Previous even
	public static void previousEven(int n) {
		if (n <= 0) {
			return;
		} else if (n % 2 == 0) {
			System.out.print(n + " ");
		}
		previousEven(n - 1);
	}

	// productOfPreviousOdd
	public static int productOfPreviousOdd(int n) {
		if (n <= 0) {
			return 1;
		} else if (n % 2 != 0) {
			return n * productOfPreviousOdd(n - 1);
		} else {
			return productOfPreviousOdd(n - 1);
		}
	}

	// sumOfPreviousN


    public static int sumOfPreviousN(int n1, int n2) {
        if (n1 < n2) {
            return 0; // Base case: if n1 is less than n2, return 0
        } else if (n1 - n2 >= 0) {
            int sum = 0;
            int temp = n1;
            // Calculate sum recursively until temp is less than n2
            sum += temp - n2;
            sum += sumOfPreviousN(temp - n2, n2);  // Recursively call the function
            return sum;
        } else {
            return n1;
        }
    }	
	
	public static void main(String[] args) {
		// Test methods here
		System.out.print("Previous even numbers before 6: ");
		previousEven(6);
		System.out.println(); // New line for better readability
		System.out.print("Previous even numbers before 9: ");
		previousEven(9);
		System.out.println(); // New line for better readability

		// Test productOfPreviousOdd method
		System.out.println("Product of previous odd numbers before 9: " + productOfPreviousOdd(9));

		// Test sumOfPreviousN method
		System.out.println("Sum of previous odd numbers minus multiples of 4 before 9: " + sumOfPreviousN(9, 4));
		System.out.println("Sum of previous odd numbers minus multiples of 6 before 20: " + sumOfPreviousN(20, 6));
	}
}

