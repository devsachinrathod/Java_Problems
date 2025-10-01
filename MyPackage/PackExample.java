import MyPackage.MyClass;

public class PackExample {

    static void newData(){
        System.out.println("Hello from PackExample class!");
    }
   public static void main(String[] args) {
      MyClass myClass = new MyClass();
      myClass.display();
        newData();
   }
}