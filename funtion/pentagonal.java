package funtion;
import java.util.*;
public class pentagonal {

    public static int getPentagonalNumber( int n ) {
        return ( n*(3*n-1))/2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" type n :");
        int n = sc.nextInt();
        int count =1 ;
        for (int i = 1; i <=n; i++) {
            System.out.print(getPentagonalNumber(i) + "\t");

        if (count%10==0) {
            System.out.println();
            count++;
            
        }
            
        }
    }
}
