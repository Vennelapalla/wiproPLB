import java.util.HashSet; 
import java.util.Iterator; 
public class Hashset { 
    private HashSet<String> H1 = new HashSet<>(); 
    public HashSet<String> saveCountryNames(String countryName) { 
        H1.add(countryName); 
        return H1; 
    } 
    public String getCountry(String countryName) { 
        Iterator<String> iterator = H1.iterator(); 
        while (iterator.hasNext()) { 
            String country = iterator.next(); 
            if (country.equals(countryName)) { 
                return country; 
            } 
        } 
        return null; 
    } 
    public static void main(String[] args) { 
        Hashset mySet = new Hashset(); 
        System.out.println(mySet.saveCountryNames("India")); 
        System.out.println(mySet.saveCountryNames("USA")); 
        System.out.println(mySet.saveCountryNames("Australia")); 
        System.out.println("Search India: " + mySet.getCountry("India")); 
        System.out.println("Search France: " + mySet.getCountry("France")); 
    } 
}
