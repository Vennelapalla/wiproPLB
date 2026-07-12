import java.util.Scanner;
class Nonnegative{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a firstnumber:");
          int n1=sc.nextInt();
        System.out.println("Enter a secondnumber:");
          int n2=sc.nextInt();
        int lastdigit1=n1%10;
        int lastdigit2=n2%10;
        if(lastdigit1==lastdigit2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}