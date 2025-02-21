import java.util.Scanner;

public class main {
 public static void main(String[] args) {
  // Array of days of the week
  String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

  // Create a Scanner object to read input from the user
  Scanner scanner = new Scanner(System.in);

  // Prompt the user to enter the current day
  System.out.print("Enter the current day (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
  int currentDay = scanner.nextInt();

  // Prompt the user to enter the number of days to add
  System.out.print("Enter the number of days to add: ");
  int n = scanner.nextInt();

  // Calculate the future day
  int futureDay = (currentDay + n) % 7;

  // Display the result
  System.out.println("The day of the week after " + n + " days will be: " + daysOfWeek[futureDay]);

  // Close the scanner
  scanner.close();
 }
}
