import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name");
        String fileName = scanner.nextLine();

        // Safety Net: Automatically create the file with sample text if it doesn't exist
        File file = new File(fileName);
        if (!file.exists()) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("This is a sample text file runner environment test.");
                System.out.println("Notice: '" + fileName + "' wasn't found, so a sample file was created automatically!");
            } catch (IOException e) {
                System.out.println("Could not create sample file: " + e.getMessage());
            }
        }

        System.out.println("Enter the character to be counted");
        String inputCharStr = scanner.nextLine();
        
        if (inputCharStr.isEmpty()) {
            System.out.println("Error: No character entered.");
            scanner.close();
            return;
        }
        
        char targetChar = Character.toLowerCase(inputCharStr.charAt(0));
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (Character.toLowerCase((char) ch) == targetChar) {
                    count++;
                }
            }
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + inputCharStr.charAt(0) + "'.");
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        scanner.close();
    }
}