// Parent class
class Override {
    void bark() {
        System.out.println("The dog is barking");
    }
}

// Child class
class CivilEng extends Override { 
    void bark() {
        System.out.println("The dog is barking loudly");
    }
}

// Main class
public class enginer_List {
    public static void main(String[] args) {
        Override obj1 = new Override();
        obj1.bark();  // Output: The dog is barking

        CivilEng obj2 = new CivilEng();
        obj2.bark();  // Output: The dog is barking loudly
    }
}
