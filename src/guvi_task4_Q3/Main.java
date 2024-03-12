package guvi_task4_Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the day position (0-6): ");
        int dayIndex = scanner.nextInt();
        
        try {
            String dayName = weekdays[dayIndex];
            System.out.println("The day is: " + dayName);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid day index. Please enter a number between 0 and 6.");
        }
    }
}

//output:
//	Enter the day position (0-6): 3
//	The day is: Wednesday
