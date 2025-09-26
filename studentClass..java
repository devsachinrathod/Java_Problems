package student_prgram;
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
    
    void printInfo(String str) {
    	 System.out.println(str);
    }

    void message() {
        if(password.equals("sachin") && password.equals("rathod")) {
            System.out.println("Sachin, you're logged in!");
        } else {
            System.out.println("Please log in first.");
        }
    }
    class subClass extends studentClass{
    	void dispaly() {
    	System.out.println("extend class" + username);
    	}
    }
    public static void main(String[] args) {
    	subClass s1 = new subClass(); // 👈 input happens here
        
        s1.printInfo();
        s1.printInfo("sachin");
        s1.message();
        s1.dispaly();
    }

	private void dispaly() {
		// TODO Auto-generated method stub
		
	}
}
