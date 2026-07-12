import java.util.Scanner;
class Malefemale{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a gender:");
        String gender=sc.next();
        System.out.println("Enter a age");
        int age=sc.nextInt();
        if(gender.equals("female")&&age>=1&&age<=58){
            System.out.println("8.2%");
        }else if(gender.equals("female")&&age>=59&&age<=100){
            System.out.println("9.2%");
        }else if(gender.equals("male")&&age>=1&&age<=58){
            System.out.println("8.4%");
        }else if(gender.equals("male")&&age>=59&&age<=100){
            System.out.println("10.5%");
        }else{
            System.out.println("Invalid input");
        }
    }
}