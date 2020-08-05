/*
An example to show call by value.
 */
public class MethodCallByValue {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 40;
        System.out.println("Value of actual arguments before method call: ");
        System.out.println(no1);
        System.out.println(no2);
        MethodCallByValue obj = new MethodCallByValue();
        System.out.println("Method call: ");
        System.out.println("Addition: "+ obj.add(no1,no2));
        System.out.println("Value of actual arguments after method call: ");
        System.out.println(no1);
        System.out.println(no2);
    }
    public int add(int no1,int no2){
        int response = no1 + no2;
        //modifying both the formal arguments
        no1 = 0;
        no2 = 0;
        return response;
    }
}
