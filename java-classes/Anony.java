// // interface Extra{
// //     void rathod();
// // }
// // class Student{
// //     int id;
// //     String name;
// //     Student(int id, String name){
// //         this.id = id;
// //         this.name = name;
// //     }
// //     void display(){
// //         System.out.println(id+"Techer"+name);
// //     }
// // }
// // public class Anony {
// //     public static void main(String[] args){
// //         Extra s1 = new Student(101, "Alice"){
// //             // @Override
// //             public void rathod(){
// //                    super.display();
// //                 System.out.println(id+" "+name+" - This is an anonymous class");
// //             }
// //         };

// //         s1.rathod();
// //     }
// // }
// interface Extra {
// void personInfo(); 
//     void rathod();
// }

// abstract class Student implements Extra {

//     int id;
//     String name;

//     Student(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     void display() {
//         System.out.println(id + " Teacher " + name);
//     }
// }

// public class Anony {

//     public static void main(String[] args) {
//         Extra s1 = new Student(101, "Alice") {

//             public void personInfo() {
//              System.out.println("This personal information method is called");
//             }

//             @Override
//             public void rathod() {
                     
//                 super.display();
//                 System.out.println(id + " " + name + " - This is an anonymous class");
//             }
//         };
//         s1.rathod(); 
//         s1.personInfo();// ✅ Now allowed
//     }
// }

interface Info {
    void display();
    void extraMethod();
}

 class Anony implements Info {
 
 public String name = "Default Name";

 public int age = 21;

 public void printTown(){
    System.out.println("This is a method in Anony class");
 }

@Override
public void extraMethod(){
    System.out.println("This is an extra method in Anony class");
}
@Override
 public void display(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
 }
 public static void main(String[] args){

    Anony obj = new Anony(){
        {
            name = "John";
            age = 25;
        }
        
        @Override
        public void display(){
            System.out.println(super.name);
            super.display();
            System.out.println("This is an anonymous class");
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        } 
        @Override
        public void extraMethod(){
            System.out.println("This is an extra method in anonymous class");
        }  
        @Override
         public void printTown(){
            System.out.println("This is a method in anonymous class");
         }
    };
    obj.display();// ✅ Now allowed
    obj.extraMethod();// ✅ Now allowed
    obj.printTown();// ✅ Now allowed
 }
}
