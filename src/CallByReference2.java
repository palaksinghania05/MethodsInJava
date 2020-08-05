//using reference type as formal argument
//try to modify it and check the effect on actual argument
public class CallByReference2 {
    public static void main(String[] args) {
        //USING STRING
        String str = "Hello World";
        StringCopy1(str);
        System.out.println("Actual argument --> " + str);
        //USING INTEGER i.e., WRAPPER CLASS
        Integer s = 12;
        StringCopy2(s);
        System.out.println("Actual argument --> " + s);
    }
    public static void StringCopy1(String str) {
        str = "Hello";
        System.out.println("Formal Argument modified by String Reference--> " + str);
    }
    public static void StringCopy2(Integer s) {
        s = 1234;
        System.out.println("Formal Argument modified by Integer Reference--> " + s);
    }
}
