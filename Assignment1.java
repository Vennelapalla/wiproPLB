import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Map4 {
    public static void main(String[] args) {
        HashMap<String, Integer> contactList = new HashMap<>();
        contactList.put("Alice", 987654321);
        contactList.put("Bob", 123456789);
        contactList.put("Charlie", 555666777);
        String key = "Alice";
        if (contactList.containsKey(key)) {
            System.out.println(key + " exists as a contact name.");
        } else {
            System.out.println(key + " does not exist as a contact name.");
        }
        Integer value = 123456789;
        if (contactList.containsValue(value)) {
            System.out.println(value + " exists as a phone number.");
        } else {
            System.out.println(value + " does not exist as a phone number.");
        }
        System.out.println("\nContact List:");
        Iterator<Map.Entry<String, Integer>> iterator = contactList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}