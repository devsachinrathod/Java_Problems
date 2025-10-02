import java.util.Scanner;

class UserInput {

    String name;
    int age;

     UserInput(String Name, int Age) {
        this.name = Name;
        this.age = Age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
    
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
    
            UserInput user = new UserInput(name, age);
            user.display();
    
            scanner.close();
        System.out.println("Hello, World!");
    }
}