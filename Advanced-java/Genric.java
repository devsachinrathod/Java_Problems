
import java.util.ArrayList;
import java.util.HashMap;

class NumberBox<T>{
   T a;
    void set(T a){
        this.a = a;
    }

    T get(){
        return a;
    }

    ArrayList<T> myNumbers = new ArrayList<>(); // Generic ArrayList

    // Add number
    void add(T a) {
        myNumbers.add(a);
    }

    // Display all numbers
    void display() {
        System.out.print("Values: ");
        for (T num : myNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NumberBox<Integer> box = new NumberBox<>();
        box.add(23);
        box.set(10);
        System.out.println("Value: " + box.get());
        // NumberBox<String> box = new NumberBox<>();
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Boolean> arr1 = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        map.put("key", "value");
        map.put("key2", "value2");
        map.put("key3", "value3");

        System.out.println("There is the value of key is " + map.keySet() + "add" + map.values());
        arr1.add(true);
        arr1.add(false);
        arr1.add(true);
        arr1.add(false);
        arr1.add(false);
        // box.add("sachin ");
        // box.add("rahul");

        System.out.println(arr1.contains(true));
        System.out.println(arr1.contains(false));
        System.out.println(arr1.contains(true));
        System.out.println(arr1.contains(false));

        arr.add("sachin ");
        arr.add("rahul");
        arr.add("Himanshu");
        arr.add("Ritesh");

        System.out.println(arr.contains("sachin "));

        // box.add("sachin ");
        // box.add("rahul");
        // box.add("Himanshu");
        // box.add("Ritesh");

        box.display();
        box.display();
    }
}
