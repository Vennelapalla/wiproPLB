import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Reverse {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Date");
        System.out.println("Original TreeSet: " + treeSet);
        TreeSet<String> reversedSet = new TreeSet<>();
        for (String item : treeSet) {
            reversedSet.add(item);
        }
        System.out.println("Reversed order (using descendingSet): " + reversedSet.descendingSet());
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        String searchElement = "Apple";
        if (treeSet.contains(searchElement)) {
            System.out.println(searchElement + " exists in the TreeSet.");
        } else {
            System.out.println(searchElement + " does not exist in the TreeSet.");
        }
        String missingElement = "Mango";
        if (treeSet.contains(missingElement)) {
            System.out.println(missingElement + " exists in the TreeSet.");
        } else {
            System.out.println(missingElement + " does not exist in the TreeSet.");
        }
    }
}