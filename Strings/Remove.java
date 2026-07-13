import java.util.Scanner;

public class Remove {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);

        java.lang.String str = sc.nextLine();
        int index = str.indexOf('*');

        if (index != -1) {
            java.lang.String result = "";

            if (index > 1) {
                result += str.substring(0, index - 1);
            }

            if (index < str.length() - 2) {
                result += str.substring(index + 2);
            }

            System.out.println(result);
        } else {
            System.out.println(str);
        }

        sc.close();
    }
}