import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
     ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    // Collections.rotate(myNumbers-> distance);();  // Sort myNumbers

    for (int i : myNumbers) {
      System.out.println(i);
    }
}
}