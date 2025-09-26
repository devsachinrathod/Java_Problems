class Animal1 {
    private String a = "hello super function";
    Animal1() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal1 {
    Dog() {
        super();  // Calls Animal's constructor
        System.out.println("Dog constructor called");
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
