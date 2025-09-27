public class Student{
    private String name;
    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printInfo() {
        System.out.println(name + " " + surname);
    }

    public static void displayData() {
        System.out.println("Static method called — not tied to any student instance");
    }

    public static void main(String[] args) {
        Student.displayData();   // better style to call static method via class
        Student s1 = new Student("Sachin", "Rathod");
        s1.printInfo();
        Student.displayData();   // again, via class
    }
}
