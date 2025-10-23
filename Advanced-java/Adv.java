
import java.util.*;

interface HomeLone {

    void arrayNumber();
}
abstract class AnimalDemo {

    // abstract method (no body)
    abstract void sound();

}
class Adv extends AnimalDemo implements HomeLone {

    void sound() {
        System.out.println("Animal sound");
    }
    ArrayList<Integer> arr = new ArrayList<>();
    HashMap<String, String> map = new HashMap<>();
    LinkedHashSet<String> set = new LinkedHashSet<>();
    


    public void setData() {
        set.add("Ravi");
        set.add("Ajay");
        set.add("Vijay");
        set.add("Ravi"); // Duplicate, will not be added
        System.out.println("Set data: " + set);
    }

    public Adv() {
        map.put("Name", "Ravi");
        map.put("City", "Delhi");
        map.put("City", "Delhi");
        
    }

    


    public void arrayNumber() {
        arr.add(12);
        System.err.println("Here show array number");
    }
    public void arrayNumber(int a) {
        arr.add(a);
        System.err.println("Here show array number with parameter: " + a);
    }

    void addData() { // ✅ defined outside arrayNumber()
        arr.add(100);
        System.out.println("Data added: " + arr);
        System.out.println("Map data: " + map);
    }

    public static void main(String[] args) {
        Adv A1 = new Adv();
        A1.arrayNumber();
          A1.arrayNumber(5);
        A1.addData();  
        A1.sound();
     

        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString.length());
    }

}
