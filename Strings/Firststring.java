import java.util.Scanner;

public class Firststring {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        java.lang.String str = sc.nextLine();

        if (str.startsWith("x")) {
            str = str.substring(1);
        }

        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }

        System.out.println(str);
        sc.close();
    }
}