package funtion;
import java.util.*;


public class funtionSum {
    public static int calcSum ( int a , int b ) {
        int sum = a + b ;
        return sum ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" int a?  : ");
        int a = sc.nextInt();

        System.out.println(" int b?  : ");
        int b = sc.nextInt();
        int sum = calcSum(a, b);
        System.out.println( " sum of 2 number is : " + sum);

    }
}
