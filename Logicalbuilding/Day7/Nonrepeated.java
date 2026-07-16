import java.util.Scanner;
public class Nonrepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long num = sc.nextLong(); 
        long temp = Math.abs(num);
        int[] frequency = new int[10];
        if (temp == 0) {
            frequency[0] = 1;
        }
           while (temp > 0) {
            int digit = (int) (temp % 10);
            frequency[digit]++;
            temp = temp / 10;
        }
        System.out.print("Non-repeated digits: ");
        int uniqueCount = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i] == 1) {
                System.out.print(i + " ");
                uniqueCount++;
            }
        }
        System.out.println("\nTotal number of non-repeated digits: " + uniqueCount);
    }
}
