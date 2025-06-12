package reecusrsion;
import java.util.*;

public class recursion1 {

    public static int calcFactorial(int n) {
        if (n==1 || n==0) {
            return 1;
        }
        int fact_nm1= calcFactorial(n-1);
        int fact_n= n*fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("value of n:");
        int n = sc.nextInt();
        int ans = calcFactorial(n);
        System.out.println("you factorial of n number is: " + ans );
    }
}