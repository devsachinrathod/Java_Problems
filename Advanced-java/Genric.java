import java.util.ArrayList;

class NumberBox<T extends String> {

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
        NumberBox<String> box = new NumberBox<>();
        ArrayList<String> arr = new ArrayList<>();

        arr.add("sachin ");
        arr.add("rahul");
        arr.add("Himanshu");
        arr.add("Ritesh");

        System.out.println(arr.contains("sachin "));

        box.add("sachin ");
        box.add("rahul");
        box.add("Himanshu");
        box.add("Ritesh");
    

        box.display();
        box.display();
    }
}
