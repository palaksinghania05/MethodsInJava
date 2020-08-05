/*
Create a method called add, that accept two integer arguments and will return an integer value
denoting sum of those two integers.
int add (int , int)
Accept the input from user.
 */

import java.util.Scanner;

public class MethodReturnValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        //call the method and declare a variable to hold result of method call
        int result = add(number1,number2);
        System.out.println("Sum = " + result);
        sc.close();
    }
    //declaring and defining the add method
    public static int add(int no1,int no2){
        //a variable to act as response of the function call
        int response = 0;
        //task
        response = no1 + no2 ;
        //returning the response to calling function
        return response;
    }
}
