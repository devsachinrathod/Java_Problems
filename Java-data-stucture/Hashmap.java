import java.util.*;
class Hashmap{
  public static void main(String[] args) {/*...*/
    Map<String, Integer> map = new HashMap<>();
    map.put("apple", 1);
    map.put("banana", 2);
    map.put("orange", 3);
    System.out.println(map.get("apple")); // prints 1
    System.out.println(map.get("banana")); // prints 2  
    System.out.println(map.get("orange")); // prints 3
    System.out.println(map.containsKey("apple")); // prints true
  }

}