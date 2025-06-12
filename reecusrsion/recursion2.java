package reecusrsion;

public class recursion2 {
    // sum of n natural number = { 1 + 2+ 3 + 4 + .... + n }  = n(n+1)/2 
     public static void printSum(int i , int n , int sum ) {
        if (i==n) {
            sum+=i;
            System.out.println(sum);
            return;
            
        }
        sum+=i;
        printSum(i+1, n, sum);
     }
     public static void main(String[] args) {
        printSum(1, 5, 0);
     }
}
