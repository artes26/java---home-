package funtion;
import java.util.*;

public class palindrome {

    public static int reverse(int num) { 
        int rev = 0;
        while (num > 0) {
            int n = num % 10;
            rev = rev * 10 + n;
            num /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) { 
        return num == reverse(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a palindrome: ");
        int n = sc.nextInt();
        sc.close();

        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }
}
