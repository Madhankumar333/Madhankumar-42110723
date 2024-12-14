package objectoriented;
import recurtion.function;  // Import the 'function' class from the 'recurtion' package

public class Object2 {
    public static void main(String args[]) {
        // You can either call the methods statically, like this:
        int powerResult = function.power(2, 3); // Direct call to the static method
        int factResult = function.fact(3); // Direct call to the static method
        
        System.out.println("2 to the power of 3 is: " + powerResult);
        System.out.println("The factorial of 3 is: " + factResult);
        
        // Alternatively, if you create an object of 'function' class, you can call the methods using that:
        function obj = new function();
        //int powerResult2 = obj.power(2, 3); // Using object reference
        int factResult2 = obj.fact(3); // Using object reference
        
        System.out.println("2 to the power of 3 is: " + obj.power(2, 3));
        System.out.println("The factorial of 3 is: " + factResult2);
    }
}
