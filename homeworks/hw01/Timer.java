// Name: Shriya Sai Shivakumar
// Date: 02/07/2024
// Question 2


import java.util.Scanner;
public class Timer {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter the current hour: ");
int hour = sc.nextInt();

System.out.print("Enter the number of tasks: ");
int tasks = sc.nextInt();

System.out.print("Enter the number of hours a task takes:");
int hourspertask = sc.nextInt();

int totaltime = hour + (tasks*hourspertask);

System.out.printf("You will finish at %d:00 o'clock.\n", totaltime);   
     }
}

