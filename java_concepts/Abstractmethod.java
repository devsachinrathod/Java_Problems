public  abstract class Abstractmethod { 
    static int age = 21;
      // ✅ Spelling fixed & class must be abstract
    public abstract void collegeInfo();   // ✅ Abstract method
    static void printAge(){
        System.out.println(age);
    }
    public static void main(String[] args) {
     
        student s1 = new student();
        s1.collegeInfo();
        student.display();
       
    }
}

class student extends Abstractmethod {

     public void collegeInfo() {     // ✅ Access modifier must be public
        System.out.println("abstract method"+age);
    }
    static void display(){
        System.out.println("Exploring abstract method");
    }
}
