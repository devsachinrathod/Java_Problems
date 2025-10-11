
import java.util.*;

class Hashmap {

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
//      // Create a HashMap object called capitalCities
// TreeMap<String, String> capitalCities = new TreeMap<>();
//     capitalCities.put("England", "London");
//     capitalCities.put("India", "New Dehli");
//     capitalCities.put("Austria", "Wien");
//     capitalCities.put("Norway", "Oslo");
//     capitalCities.put("Norway", "Oslo"); // Duplicate
//     capitalCities.put("USA", "Washington DC");

//         Iterator<String> it = capitalCities.keySet().iterator();
//         System.out.println("" + it.next());
//  ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//     myNumbers.add(33);
//     myNumbers.add(15);
//     myNumbers.add(20);
//     myNumbers.add(34);
//     myNumbers.add(8);
//     myNumbers.add(12);

//     Collections.sort(myNumbers);  // Sort myNumbers
//     for (int i : myNumbers) {
//       System.out.println(i);
//     }
//     System.out.println(capitalCities);
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        while (it.hasNext()) {
          String i = it.next();

          if(i != "Volvo"){
            it.remove();
          } 
        
        }
          System.err.println(cars);
    }
};
