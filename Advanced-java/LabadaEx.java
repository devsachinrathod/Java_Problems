// import java.util.function.Consumer;

// interface MyInterface {
//     String sayHello(String name);
// }

// interface MyExper {
//     String exper();
//     Integer labaExpress();
// }
// interface MyLambda {
//     Integer labaExpress();
// }
// abstract class ExampleLaba {

//     abstract void show();
// }

// public class LabadaEx extends ExampleLaba  {

//     public static void main(String[] args) {
//         MyInterface show = (name) -> "Hello, " + name;

//         MyLambda lambda = () -> 42;
//         System.out.println("Lambda result: " + lambda.labaExpress());

//         MyExper s = new MyExper() {
//             // @Override
//             public String exper() {
//                 return "Hello, this is a lambda expression!";
//             }

//             public Integer labaExpress() {
//                 return 42;
//             }
//         };

//         // OR using lambda expressions separately:
//         MyExper sLambda = new MyExper() {
//             public String exper() {
//                 return "Hello, this is a lambda expression!";
//             }

//             public Integer labaExpress() {
//                 return 42;
//             }
//         };

//         System.out.println(s.exper());
//         System.out.println(s.labaExpress());
 

//         Consumer<String> c = (name) -> {
//             System.out.println("Hello, " + name + "!");
//         };
//         c.accept("Diapk");
//     }
// }
@FunctionalInterface
interface UnderAgeWarning {
    void showMessage();
}

class LabadaEx implements UnderAgeWarning {

    // @Override
    public void showMessage() {
        System.out.println("You are underage! (from class)");
    }

    public static void main(String[] args) {
        // Lambda implementation
        UnderAgeWarning ex = () -> System.out.println("You are underage! (from lambda)");

        ex.showMessage(); // Lambda output

        // Class instance
        LabadaEx instance = new LabadaEx();
        instance.showMessage();
    }
}
