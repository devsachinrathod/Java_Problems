
import java.util.*;

class Example {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // duplicate, will be ignored

        System.out.println(set); // [Apple, Banana, Cherry]
        if(set.contains("Banana")) {
            System.out.println("There is Banana");
        }
        // shuffle requires a List, so convert the set to a list, shuffle it, and print the shuffled list
        List<String> list = new ArrayList<>(set);
        Collections.shuffle(list);
        System.out.println(list);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println("There is all the items: " + it.next());
        }
        System.out.println(set); // [Banana, Cherry]
    }
}
