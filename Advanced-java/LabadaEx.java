
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class LabadaEx {

    public static void main(String[] args) {
        // Lambda expression to implement a functional interface
        Runnable r = () -> System.out.println("Hello from Lambda Expression!");

        BiConsumer<Integer, Integer> p = (a, b) -> {
            System.out.println("Sum: " + (a + b));
        };
        // Running the lambda expressions
        r.run();
        p.accept(5, 10);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> nums = (n) -> {System.out.println("Output"+ n);};
        numbers.forEach(nums);
    }
}
    
