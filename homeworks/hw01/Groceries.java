// Name: Shriya Sai Shivakumar
// Date: 02/07/2024

import java.util.Scanner;

  public class Groceries {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

System.out.print("How many times do you go to the grocery store each week? ");
int numTrips = sc.nextInt();

System.out.print("How much do you spend on each trip? ");
double costPerTrip = sc.nextDouble();


System.out.print("How much do you spend on each trip? ");
double costPerTrip = sc.nextDouble();

double totalCost = numTrips * costPerTrip;

System.out.printf("This week you spent $%.2f on groceries.\n", totalCost);

	}
}

