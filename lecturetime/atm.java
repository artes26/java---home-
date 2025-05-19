import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        // Array of days of the week
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current day (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int currentDay = scanner.nextInt();

        
        System.out.print("Enter the number of days to add: ");
        int n = scanner.nextInt();

        // Calculate the future day
        int futureDay = (currentDay + n) % 7;

       
        System.out.println("The day of the week after " + n + " days will be: " + daysOfWeek[futureDay]);

    
        scanner.close();
    }
}
