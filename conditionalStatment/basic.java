package conditionalStatment;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        
    
//     Conditional Statements ‘if-else’
// The if block is used to specify the code to be executed if the condition specified  in if is true, the else block is executed otherwise.


int age = 30;
if(age > 18) {
   System.out.println("This is an adult");
} else {
   System.out.println("This is not an adult");
}



// Conditional Statements ‘switch’
// Switch case statements are a substitute for long if statements that compare a
// variable to multiple values. After a match is found, it executes the
// corresponding code of that value case.
// The following example is to print days of the week:

Scanner sc = new Scanner(System.in);
int a= sc.nextInt();

int n = a;
switch(n) {
   case 1 :
       System.out.println("Monday");
       break;
   case 2 :
       System.out.println("Tuesday");
       break;
   case 3 :
       System.out.println("Wednesday");
       break;
   case 4 :
       System.out.println("Thursday");
       break;
   case 5:
       System.out.println("Friday");
       break;
   case 6 :
       System.out.println("Saturday");
       break;
   default :
       System.out.println("Sunday");
}



}
}

