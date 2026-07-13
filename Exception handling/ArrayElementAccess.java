import java.util.Scanner;

public class ArrayElementAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // 1. Get array size
            System.out.println("Enter the number of elements in the array");
            int n = Integer.parseInt(sc.nextLine());
            
            // 2. Create array and get elements
            int arr[] = new int[n];
            System.out.println("Enter the elements in the array");
            
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(sc.nextLine());
            }
            
            // 3. Get index from user
            System.out.println("Enter the index of the array element you want to access");
            int index = Integer.parseInt(sc.nextLine());
            
            // 4. Access and print element
            System.out.println("The array element at index " + index + " = " + arr[index]);
            System.out.println("The array element successfully accessed");
            
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            // Handles if index is < 0 or >= array length
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } 
        catch (NumberFormatException e) {
            // Handles if user enters string instead of number
            System.out.println("java.lang.NumberFormatException");
        }
        
        sc.close();
    }
}