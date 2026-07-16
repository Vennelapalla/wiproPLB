import java.util.Scanner;
public class Lastdigit {
    public static int getLastdigit(int n) {
        return Math.abs(n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Last Digit = " + getLastdigit(n));
        sc.close();
    }
}