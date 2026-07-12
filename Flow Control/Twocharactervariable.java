import java.util.Scanner;
class Twocharactervariable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a firstcharacter:");
        char c1=sc.next().charAt(0);
        int ascii1=(int)c1;
        System.out.println("Enter a secondcharacter:");
        char c2=sc.next().charAt(0);
        int ascii2=(int)c2;
        if(ascii1>ascii2){
            System.out.println(c2+","+c1);
        }else{
            System.out.println(c1+","+c2);
        }
    }
}