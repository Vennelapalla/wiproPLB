import java.util.Scanner;

public class Merge {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);

        java.lang.String a = sc.nextLine();
        java.lang.String b = sc.nextLine();

        java.lang.String result = "";
        int max = Math.max(a.length(), b.length());

        for (int i = 0; i < max; i++) {
            if (i < a.length()) {
                result += a.charAt(i);
            }
            if (i < b.length()) {
                result += b.charAt(i);
            }
        }

        System.out.println(result);
        sc.close();
    }
}