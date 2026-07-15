import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get input file path
        System.out.println("Enter the input file name");
        String inputFileName = scanner.nextLine();

        // Safety Net: Automatically create the input file if it does not exist
        File inputFile = new File(inputFileName);
        if (!inputFile.exists()) {
            try (FileWriter tempWriter = new FileWriter(inputFile)) {
                tempWriter.write("This is the default content of the source file. It has been copied successfully!");
                System.out.println("Notice: '" + inputFileName + "' wasn't found, so a sample file was created automatically!");
            } catch (IOException e) {
                System.out.println("Could not create sample input file: " + e.getMessage());
            }
        }

        // 2. Get output file path
        System.out.println("Enter the output file name");
        String outputFileName = scanner.nextLine();

        // 3. Perform the stream copying logic character by character
        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFileName)) {
            
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            
            System.out.println("File is copied.");
            
        } catch (IOException e) {
            System.out.println("Error during file operations: " + e.getMessage());
        }

        scanner.close();
    }
}