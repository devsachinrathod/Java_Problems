import java.util.*;
class Hashmap{
  public static void main(String[] args) {/*...*/
    // Map<String, Integer> map = new HashMap<>();
    // map.put("apple", 1);
    // map.put("banana", 2);
    // map.put("orange", 3);
    // System.out.println(map.get("apple")); // prints 1
    // System.out.println(map.get("banana")); // prints 2  
    // System.out.println(map.get("orange")); // prints 3
    // System.out.println(map.containsKey("apple")); // prints true
    // for(String key : map.keySet()){
    //   System.out.println(key + " " + map.get(key));
    // }
     // Create a HashMap object called capitalCities
TreeMap<String, String> capitalCities = new TreeMap<>();
    capitalCities.put("England", "London");
    capitalCities.put("India", "New Dehli");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("Norway", "Oslo"); // Duplicate
    capitalCities.put("USA", "Washington DC");

    System.out.println(capitalCities);
  }
};