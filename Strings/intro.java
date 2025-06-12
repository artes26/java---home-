package Strings;


import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        String firstName = "tony";
        String lastName= "stark";

        Scanner sc= new Scanner(System.in);
        String names = sc.nextLine();
        System.out.println("your name is: " + names);


        // concatation  --- adding a string
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        // charAt
        for( int i =0 ; i<fullName.length(); i++) {
        System.out.println(fullName.charAt(i));
        }

        //string compare 
        if (firstName.compareTo(lastName)==0) {
            System.out.println("string are equals");
         } else { 
            System.out.println(" String are not rquals");
         }
         

         String sentance = "my name is tony stark";
         //substring(beg index, end index)
        //  String name=sentance.substring(11, sentance.length());
         String name=sentance.substring(11,15);

         System.out.println(name);

         // String are imutable

    }

    
}
