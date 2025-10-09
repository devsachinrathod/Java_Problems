
import java.util.ArrayList;

 class Ds {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add(0, "Mazda");
    cars.set(1, "lembi"); // Insert element at the beginning of the list (0)
    System.out.println(cars.get(2));
    System.out.println(cars);   
    System.out.println(cars.size());
  }
}