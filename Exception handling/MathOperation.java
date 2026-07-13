public class MathOperation {
    public static void main(String[] args) {
        try {
            if(args.length!= 5) {
                System.out.println("Please enter exactly 5 integers");
                return;
            }
            
            int arr[] = new int[5];
            int sum = 0;
            
            // Convert command line args to integers
            for(int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(args[i]);
                sum = sum + arr[i];
            }
            
            double average = (double) sum / 5;
            
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);
            
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException: Invalid input. Please enter only integers.");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}