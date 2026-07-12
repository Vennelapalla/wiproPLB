import java.util.Scanner;
class Commandlineargument{
    public static void main(String args[]){
        if(args.length==0){
            System.out.println("No values");
        }else{
            System.out.println(String.join(", ", args));
        }
    }
}