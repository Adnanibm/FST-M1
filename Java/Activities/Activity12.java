package activities;

//File: Activity12.java

//1. Define the functional interface
@FunctionalInterface
interface Addable {
 int add(int num1, int num2);
}

//2. Main class
public class Activity12 {
 public static void main(String[] args) {

     // Lambda without body
     Addable ad1 = (a, b) -> (a + b);

     // Lambda with body and return statement
     Addable ad2 = (int a, int b) -> {
         return (a + b);
     };

     // Test outputs
     System.out.println("Using ad1: " + ad1.add(10, 20));
     System.out.println("Using ad2: " + ad2.add(15, 25));
 }
}
