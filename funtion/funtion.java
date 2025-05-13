package funtion;
// publi static  returnType funtionName (type arg1 , type arg2 ... ) { 
//                  |---- int, float , string 

//     // operation 
// }
import java.util.*;
public class funtion {

    public static void printMyName ( String name ) {      // void - no return type 
        System.out.println(name);

        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type your name : ");
        String name = sc.next();
        printMyName( "your name is : " + name); // call funvtion 
    }

    
}