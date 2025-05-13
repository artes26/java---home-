package funtion;
import java.util.*;
// public class printFactorial { 

//     public static void printFacto ( int n  ) { 
//          //loop
//          int factorial = 1;
//          for ( int i=n; i>=1; i-- ) {
//             factorial = factorial * i;
//             }
//             System.out.println(factorial);
//         return;
//     }

 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" input n : ");
//         int n = sc.nextInt();
//         printFacto(n);


//     }
    
// }

public class printFactorial {

    public static void printFactorial(int n ) {
        int factorial=1;
        for( int i=n; i>=1; i--){
            factorial= factorial*i;
            
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" input n : ");
        int n = sc.nextInt();
        printFactorial(n);

        
    }
}