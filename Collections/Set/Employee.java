import java.util.HashSet;
import java.util.Iterator;
public class Employee {
    public static void main(String[] args) {
        HashSet<String> employeeNames = new HashSet<>();
        employeeNames.add("Alice");
        employeeNames.add("Bob");
        employeeNames.add("Charlie");
        employeeNames.add("Alice");
        Iterator<String> iterator = employeeNames.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}