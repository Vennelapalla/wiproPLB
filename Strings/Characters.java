import java.util.Scanner;

public class Characters {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);

        java.lang.String str = sc.nextLine();
        int n = sc.nextInt();

        java.lang.String last = str.substring(str.length() - n);

        for (int i = 0; i < n; i++) {
            System.out.print(last);
        }

        sc.close();
    }
}