import java.util.Scanner;
class Lowerupper{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        if(ch>='A'&&ch<='Z'){
           System.out.println(Character.toLowerCase(ch)); 
        }else if(ch>='a'&&ch<='z'){
            System.out.println(Character.toUpperCase(ch));
        }else{
            System.out.println("Invalid character");
        }
    }
}