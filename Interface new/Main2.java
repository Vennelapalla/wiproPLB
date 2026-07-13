// Functional interface with 3 parameters
@FunctionalInterface
interface Test {
    int myFunction(int a, int b, int c);
}

// Main class
public class Main2 {
    public static void main(String[] args) {
        // t1: add three integers
        Test t1 = (a, b, c) -> a + b + c;
        
        // t2: multiply three integers  
        Test t2 = (a, b, c) -> a * b * c;
        
        // Call myFunction using t1 and t2
        int sumResult = t1.myFunction(2, 3, 4);
        int multiplyResult = t2.myFunction(2, 3, 4);
        
        System.out.println("Addition Result: " + sumResult);
        System.out.println("Multiplication Result: " + multiplyResult);
    }
}