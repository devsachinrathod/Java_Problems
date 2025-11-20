interface localString {
    String show();
}

interface labaExpression {
    String exper();
}

@FunctionalInterface
interface Calc {
    int operation(int a, int b);
}

@FunctionalInterface
interface Hello {
    void say();
}

class Lab {

    void display() {
        System.out.println("This is display method");
    }

    public static void main(String[] args) {

        Lab L1 = new Lab();
        L1.display();

        // 1️⃣ Simple Lambda (No Parameters)
        Hello h1 = () -> System.out.println("Hello from no-parameter lambda");
        h1.say();

        // 2️⃣ Lambda Returning a String
        localString ls = () -> "Hello, this is a local string!";
        System.out.println(ls.show());

        // 3️⃣ Simple Lambda Returning a String
        labaExpression obj = () -> "Hello, this is a lambda expression!";
        System.out.println(obj.exper());

        // 4️⃣ Lambda with SINGLE Parameter
        localString oneParam = () -> "Single Param Example";  // same interface
        System.out.println(oneParam.show());

        // 5️⃣ Lambda with MULTIPLE Parameters
        Calc add = (a, b) -> a + b;
        System.out.println("Addition : " + add.operation(10, 20));

        // 6️⃣ Lambda with EXPLICIT DATA TYPES
        Calc multiply = (int a, int b) -> a * b;
        System.out.println("Multiply : " + multiply.operation(5, 6));

        // 7️⃣ Lambda with MULTI-LINE BLOCK
        Calc sub = (a, b) -> {
            System.out.println("Performing subtraction...");
            return a - b;
        };
        System.out.println("Subtraction : " + sub.operation(30, 10));

        // 8️⃣ Lambda Assigned to a Variable
        Hello h2 = () -> System.out.println("Lambda stored in a variable");
        h2.say();

        // 9️⃣ Lambda Passed Directly as an Argument
        runThread(() -> System.out.println("Thread running using lambda"));

        // 🔟 Method Reference (related to lambda)
        Hello h3 = L1::display; 
        h3.say();
    }

    // Method to accept lambda
    public static void runThread(Hello h) {
        h.say();
    }
}
