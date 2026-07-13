import java.util.Scanner;

// Custom Exception for Negative values
class NegativeValueException extends Exception {
    public NegativeValueException(String msg) {
        super(msg);
    }
}

// Custom Exception for Values out of range 0-100
class ValueOutOfRangeException extends Exception {
    public ValueOutOfRangeException(String msg) {
        super(msg);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            for(int s = 1; s <= 2; s++) {
                System.out.println("Enter name of student " + s);
                String name = sc.nextLine();
                
                int total = 0;
                System.out.println("Enter marks in 3 subjects for " + name);
                
                for(int i = 1; i <= 3; i++) {
                    System.out.print("Subject " + i + ": ");
                    String input = sc.nextLine();
                    int marks = Integer.parseInt(input); // may throw NumberFormatException
                    
                    // Check for negative
                    if(marks < 0) {
                        throw new NegativeValueException("Marks cannot be negative");
                    }
                    
                    // Check for out of range
                    if(marks > 100) {
                        throw new ValueOutOfRangeException("Marks should be between 0-100");
                    }
                    
                    total = total + marks;
                }
                
                double average = (double) total / 3;
                System.out.println("Average marks of " + name + " = " + average);
                System.out.println();
            }
            
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException: Please enter integer values only");
        } catch (NegativeValueException e) {
            System.out.println("NegativeValueException: " + e.getMessage());
        } catch (ValueOutOfRangeException e) {
            System.out.println("ValueOutOfRangeException: " + e.getMessage());
        }
        
        sc.close();
    }
}