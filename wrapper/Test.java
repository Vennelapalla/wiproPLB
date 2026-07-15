public class Test {
    public static void main(String[] args) {
        int number;

        // If no command line argument is passed, use a default value (e.g., 20)
        if (args.length < 1) {
            number = 20; // Default value so it runs instantly on click
        } else {
            try {
                number = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Provided argument is not a valid integer.");
                return;
            }
        }

        // Convert using Integer wrapper class methods
        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hex = Integer.toHexString(number);

        // Print the output exactly as requested
        System.out.println("Given Number :" + number);
        System.out.println("Binary equivalent :" + binary);
        System.out.println("Octal equivalent :" + octal);
        System.out.println("Hexadecimal equivalent :" + hex);
    }
}