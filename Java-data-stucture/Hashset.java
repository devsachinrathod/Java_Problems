import java.util.*;

class Example {
  public static void main(String[] args) {
    LinkedHashSet<String> set = new LinkedHashSet<>();

    set.add("Apple");
    set.add("Banana");
    set.add("Cherry");
    set.add("Apple"); // duplicate, will be ignored

    System.out.println(set); // [Apple, Banana, Cherry]

    // Iteration
    for (String fruit : set) {
      System.out.println(fruit);
    }

    // Check presence
    System.out.println("Contains Banana? " + set.contains("Banana")); // true

    // Remove element
    set.remove("Apple");
    System.out.println(set); // [Banana, Cherry]
  }
}
