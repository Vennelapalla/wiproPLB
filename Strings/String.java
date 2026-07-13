import java.util.Scanner;

public class String {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);

        java.lang.String str = sc.nextLine();
        java.lang.String firstTwo = str.substring(0, 2);
        java.lang.String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += firstTwo;
        }

        System.out.println(result);
        sc.close();
    }
}