//HW05 Number Loop

public class NumbersLoops {

	// 1.1
	public static void previousEven(int num) {
		for (int i = num; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(); 
	}

	//1.2
	public static void previousOdd(int num) {
		while (num >= 1) {
			if (num % 2 != 0) {
				System.out.print(num + " ");
			}
			num--;
		}
		System.out.println(); 
	}

	// 1.3
	public static void main(String[] args) {
		previousOdd(6);
		previousOdd(9);
		previousEven(6); 
		previousEven(9); 
	}
}


