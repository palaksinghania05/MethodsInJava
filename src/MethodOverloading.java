/*
Create add method which accept two int arguments. Create another method with same name
which accepts two double arguments, to demonstrate method overloading.
 */
public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.add(12,13));
        System.out.println(obj.add(12.2,34.5));
        //Hit and trial
        System.out.println(obj.add(12,13.5));
        System.out.println(obj.add(12.2,34));
    }
    public int add(int no1, int no2){
        System.out.println("Integer Arguments:");
        int response = 0;
        response = no1 + no2;
        return response;
    }
    public double add(double no1, double no2){
        System.out.println("Double Arguments:");
        double response = 0.0;
        response = no1 + no2;
        return response;
    }
}
