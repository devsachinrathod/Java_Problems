// class OtherPeople{
//   public  int age = 23;
// }

// class Encapsulatiion_j extends OtherPeople{

  
//   public void printAge(){
//     System.out.println("Age: " + age);
//   }
// public static void main(String[] args) {
//     Encapsulatiion_j o1 = new Encapsulatiion_j();
//     o1.printAge();
// }
// }

public class OtherPeople {
    // keep the field private to enforce encapsulation
    private int age = 23;

    // getter
    public int getAge() {
        return age;
    }

    // setter with simple validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Must be >= 0");
        }
    }
}

class Encapsulatiion_j extends OtherPeople {

    public void printAge() {
        // access age via getter (not directly)
        System.out.println("Age: " + getAge());
    }

    public static void main(String[] args) {
        Encapsulatiion_j o1 = new Encapsulatiion_j();

        o1.printAge();     // Age: 23
        o1.setAge(30);
        o1.printAge();     // Age: 30

        o1.setAge(-5);     // Invalid age. Must be >= 0
        o1.printAge();     // Age: 30 (unchanged)
    }
}
