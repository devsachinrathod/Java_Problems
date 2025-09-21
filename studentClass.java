
import java.util.Scanner;

public class studentClass {
    private String username;
    private String password;

    // Constructor that takes input from user
    studentClass() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        this.username = sc.nextLine();

        System.out.print("Enter your surname: ");
        this.password = sc.nextLine();
    }

    void printInfo() {
        System.out.println(username + " " + password);
    }

    void message() {
        if(password.equals("sachin") && password.equals("rathod")) {
            System.out.println("Sachin, you're logged in!");
        } else {
            System.out.println("Please log in first.");
        }
    }

    public static void main(String[] args) {
        studentClass s1 = new studentClass(); // 👈 input happens here
        s1.printInfo();
        s1.message();
    }
}
