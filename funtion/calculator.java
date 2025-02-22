package funtion;
import java.util.*;

public class calculator {

    public static int addSimple ( int x, int y) {
        return x+y;

    }

    public static int subSimple ( int x, int y) {
        return y-x;

    }

    
    public static int multiSimple ( int x, int y) {
        return x*y;

    }

    public static int divideSimple ( int x, int y) {
        return y/x;

    }

    public static int remendSimple ( int x, int y) {
        return x%y;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter x : ");
        int a = sc.nextInt();
        System.out.println(" enter y : ");
        int b = sc.nextInt();

        System.out.println(" enter the opretor : ");

        char ch = Obj.nextLine().charAt(0);
        switch (ch) {
            case '+': System.out.println( );
                
                break;
        
            default: System.out.println( " enter the valid operator ");
                break;

            case; 
                 

        }

    }
    
}
