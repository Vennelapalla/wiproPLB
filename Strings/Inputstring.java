import java.util.Scanner;

public class Inputstring {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);

        java.lang.String str = sc.nextLine();

        if (str.length() > 2) {
            System.out.println(str.substring(1, str.length() - 1));
        } else {
            System.out.println("");
        }

        sc.close();
    }
}