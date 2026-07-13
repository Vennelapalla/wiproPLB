import java.util.Scanner;

public class Longerstring {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);

        java.lang.String a = sc.nextLine();
        java.lang.String b = sc.nextLine();

        if (a.length() < b.length()) {
            System.out.println(a + b + a);
        } else {
            System.out.println(b + a + b);
        }

        sc.close();
    }
}