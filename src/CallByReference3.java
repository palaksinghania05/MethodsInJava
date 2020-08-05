import java.util.Arrays;

//solution of problem of argument modification
public class CallByReference3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        //calling a method from other class
        MethodCallByReference obj = new MethodCallByReference();
        //passing the array clone as parameter so that actual array do not get modified
        System.out.println(obj.add(arr.clone()));
        System.out.println("Actual array --> " + Arrays.toString(arr));
    }
}
