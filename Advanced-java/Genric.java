
// // class Box<T> {

// //     T value;

// //     void set(T value) {
// //         this.value = value;
// //     }

// //     T get() {
// //         return value;
// //     }

// //     static void printInformation() {
// //         System.out.println("this is method inside of  generic");
// //     }

// //     public static <T> void printArray(T[] array) {
// //         for (T item : array) {
// //             System.out.println(item);
// //         }
// //     }
// // }

// // // Box2 is fixed to work only with String
// // class Genric extends Box<String> {

// //     public static void main(String[] args) {

// //         try {
// //             printInformation();
// //             String[] names = {"Jenny", "Liam"};
// //             printArray(names);
// //             Genric stringBox = new Genric();

// //             stringBox.set("Hello");
// //             System.out.println("Value: " + stringBox.get());
// //         } catch (Exception e) {
// //             System.err.println("erro is here" + e);
// //         }
// //     }
// // }
// class Stats<T extends Number> {
//   T[] nums;

//   // Constructor
//   Stats(T[] nums) {
//     this.nums = nums;
//   }

//   // Calculate average
//   double average() {
//     double sum = 0;
//     for (T num : nums) {
//       sum += num.doubleValue();
//     }
//     return sum / nums.length;
//   }
// }

// public class Genric{
//   public static void main(String[] args) {
//     // Use with Integer
//     Integer[] intNums = {10, 20, 30, 40};
//     Stats<Integer> intStats = new Stats<>(intNums);
//     System.out.println("Integer average: " + intStats.average());

//     // Use with Double
//     Double[] doubleNums = {1.5, 2.5, 3.5};
//     Stats<Double> doubleStats = new Stats<>(doubleNums);
//     System.out.println("Double average: " + doubleStats.average());
//   }
// }

// class Box<T>{
//   T value[];

//  void set(T[] values ){
//    this.value = values;
//  }
//  T[] get(){
//   return value;
//  }

//  void display(){
//   System.out.println("All this execution");
//  }

//  public static void main(String[] args) {
//   Integer[] stat = {2,4,4,2,3,2};
//  Box<Integer> myVaInteger = new Box<>();
//      myVaInteger.set("sachin");
//      myVaInteger.display();
//      System.out.print(myVaInteger.get());

//  }
// }

class Box<T extends Number> { // Restrict T to numeric types
    T[] values;

    // Proper constructor (no return type)
    Box(T[] values) {
        this.values = values;
    }

    T[] get() {
        return values;
    }

    // Calculate average
    double average() {
        double sum = 0;
        for (T num : values) {
            sum += num.doubleValue(); // convert to double
        }
        return sum / values.length;
    }

    void display() {
        System.out.print("Values: ");
        for (T val : values) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] stat = {2, 4, 4, 2, 3, 2};
        Box<Integer> myVaInteger = new Box<>(stat);

        myVaInteger.display();
        System.out.println("Average: " + myVaInteger.average());
    }
}
