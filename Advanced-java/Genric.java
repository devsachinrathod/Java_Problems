
class Box<T> {

    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
    static void printInformation(){
        System.out.println("this is method inside of  generic");
    }

    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}

// Box2 is fixed to work only with String
class Genric extends Box<String> {

    public static void main(String[] args) {

        try {
            printInformation();
            String[] names = {"Jenny", "Liam"};
            printArray(names);
            Genric stringBox = new Genric();

            stringBox.set("Hello");
            System.out.println("Value: " + stringBox.get());
        } catch (Exception e) {
            System.err.println("erro is here" + e);
        }
    }
}
