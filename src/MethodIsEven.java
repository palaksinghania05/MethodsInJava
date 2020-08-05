/*
Create a method IsEven(int,int), which accept one argument of type int and return a boolean value
true if number is even otherwise false.
 */
import java.util.Scanner;

public class MethodIsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no1 = sc.nextInt();
        MethodIsEven obj = new MethodIsEven();
        boolean result = obj.IsEven(no1);
        System.out.println("Number is even --> " + result);
        sc.close();
    }
    public boolean IsEven(int n01){
        boolean response = false;
        if(n01 % 2 == 0){
            response = true;
        }
        return response;
    }
}
