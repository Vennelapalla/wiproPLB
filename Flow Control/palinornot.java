import java.util.Scanner;
class palinornot{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
       int rev=0;
       int original=n;
       while(n>0){
       int lastdigit=n%10;
        rev=(rev*10)+lastdigit;
        n=n/10;
       }
       if(original==rev){
            System.out.println(original+" is a palindrome");
        }else{
            System.out.println(original+" is not a palindrome");
        }
    }

}