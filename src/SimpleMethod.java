/*
Create a method called display(), this method will print Hello World as output and
will not return any value.
 */
public class SimpleMethod {
    public static void main(String[] args) {
        System.out.println("Simple Method starts:-");
       //create object to call display method
       SimpleMethod obj = new SimpleMethod();
       obj.display();
       System.out.println("Exiting....");
    }
    //declaring and defining display method
    //non-static or instance method
    public void display(){
        System.out.println("Hello World");
    }
}
