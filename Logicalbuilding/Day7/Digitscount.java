import java.util.Scanner;
public class Digitscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int count = 0;
        int temp = Math.abs(n); 
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp = temp / 10; 
                count++;          
            }
        }        
        System.out.println("Total number of digits: " + count);
        sc.close();
    }
}
