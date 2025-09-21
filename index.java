//  public Student(int age, String s) {
// 	super();
// 	this.age = age;
// 	this.s = s;
//  }
//  public void registerCourse() {
// 	 if(age< 18) {
// 		 throw new UnderAgeException(s+ "your age under can't entroll 18");
// 	 }
// 	 else
// 	 {
// 		 System.out.println(s+ "sucessfully enrolled");
// 	 }
	
//  }
//  public static void main(String[] args) {
// 	 Student s1 = new Student(23, "ravi");
// 	 Student s2 = new Student(12, "sachin");
// 	 s1.registerCourse();
// //	 s2.registerCourse(); 
// 	 try {
// 		 s2.registerCourse(); 
// 	 }
// 	 catch(UnderAgeException e) {
// 		 System.out.println(e.getMessage());
// 	 }

//  }

abstract class Animal {
    // abstract method (no body)
    abstract void sound();

    // normal method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    // must implement abstract method
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class index {
    public static void main(String[] args) {
        Animal a = new Dog(); // reference = abstract, object = Dog
        a.sound();  // Bark
        a.sleep();  // Sleeping...
    }
}
