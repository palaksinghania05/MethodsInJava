/*
An example to show call by reference.
Adding all elements of array using add method.
 */
import java.util.Arrays;

public class MethodCallByReference {
    public static void main(String[] args) {
        int[] brr = {10,20,30,40};
        System.out.println("Array before method call: ");
        System.out.println("brr--> " + Arrays.toString(brr));
        MethodCallByReference obj = new MethodCallByReference();
        System.out.println("Method Call: ");
        System.out.println("Sum of all elements of array: " + obj.add(brr));
        System.out.println("Array after method call: ");
        System.out.println("brr--> " + Arrays.toString(brr));
    }
    public int add(int[] arr){
        int response = 0;
        for(int i = 0; i < arr.length; i++) {
            response = response + arr[i];
            //modifying the elements of array
            arr[i] = 0;
        }
        return response;
    }
}
