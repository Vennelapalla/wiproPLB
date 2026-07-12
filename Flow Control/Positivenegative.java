import java.util.Scanner;
class Positivenegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        sc.close(); 
    }
}