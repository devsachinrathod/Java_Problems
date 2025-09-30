public abstract class Abtsractmethod {   // ✅ Spelling fixed & class must be abstract
    public abstract void collegeInfo();   // ✅ Abstract method

    public static void main(String[] args) {
     
        student s1 = new student();
        s1.collegeInfo();
       
    }
}

class student extends Abtsractmethod {

     public void collegeInfo() {     // ✅ Access modifier must be public
        System.out.println("abstract method");
    }
    void display(){
        System.out.println("Exploring abstract method");
    }
}
