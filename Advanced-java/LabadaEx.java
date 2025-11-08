import java.util.function.Consumer;

interface MyInterface {
    String sayHello(String name);
}

interface MyExper {
    String exper();
    Integer labaExpress();
}

public class LabadaEx {

    public static void main(String[] args) {

        MyExper s = new MyExper() {
            public String exper() {
                return "Hello, this is a lambda expression!";
            }

            public Integer labaExpress() {
                return 42;
            }
        };

        // OR using lambda expressions separately:
        MyExper sLambda = new MyExper() {
            public String exper() {
                return "Hello, this is a lambda expression!";
            }

            public Integer labaExpress() {
                return 42;
            }
        };

        System.out.println(s.exper());
        System.out.println(s.labaExpress());
 

    integer value ->{
        system.out.println("The integer value is: " + value);
    }
        Consumer<String> c = (name) -> {
            System.out.println("Hello, " + name + "!");
        };
        c.accept("Diapk");
    }
}
