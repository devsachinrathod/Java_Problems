public class Roomates {

    private String name;
    private String address;

    Roomates(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("The name of roommate: " + name + " and address: " + address);
    }

    public static void main(String[] args) {
        Roomates n1 = new Roomates("sachin", "Nanded, Maharastra");
        n1.display();
    }
}
