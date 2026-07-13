// User defined exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class PersonAgeCheck {
    public static void main(String[] args) {
        try {
            // Check if 2 arguments are passed
            if(args.length!= 2) {
                System.out.println("Error: Please enter both Name and Age");
                return;
            }
            
            String name = args[0];
            int age = Integer.parseInt(args[1]); // may throw NumberFormatException
            
            // Check age condition
            if(age < 18) {
                throw new InvalidAgeException("Age must be >= 18. You entered: " + age);
            } else if(age >= 60) {
                throw new InvalidAgeException("Age must be < 60. You entered: " + age);
            }
            
            // If valid
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Registration Successful");
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a number");
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
    }
}