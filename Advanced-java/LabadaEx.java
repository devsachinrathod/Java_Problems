
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

interface MyInterface {
    String sayHello(String name);
}

interface MyExper {
    String exper();
}

public class LabadaEx {

    public static void main(String[] args) {

        MyExper s = () -> {
            return "Hello, this is a lambda expression!";
        };
        System.out.println(s.exper());
        System.out.println(s.exper());

        MyInterface myInterface = (name) -> {
            return "Hello, " + name + "!";
        };

        formatString("sachin", myInterface);

        System.out.println(myInterface.sayHello("Ravi"));
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
        Consumer<Integer> nums = (n) -> {
            System.out.println("Output" + n);
        };
        numbers.forEach(nums);
    }
 

    public static void formatString(String str, MyInterface cons) {
        String result = cons.sayHello(str);
        System.out.println(result);
    }
}
