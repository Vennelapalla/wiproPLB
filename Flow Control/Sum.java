import java.util.Scanner;

class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anumber:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = n; i > 0; i = i / 10) {
            sum = sum + (i % 10);
        }
        System.out.println(sum);
        sc.close();
    }
}