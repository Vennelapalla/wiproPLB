import java.util.ArrayList;
public class Numberarray {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(10);        
        numbers.add(12.5f);    
        numbers.add(20.75);     
        numbers.add(100L);      
        for (Number number : numbers) {
            System.out.println(number);
        }
    }
}