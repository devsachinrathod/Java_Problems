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
}

 class Anony implements Info {
 
 public String name;
 public int age;

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
            super.display();
            System.out.println("This is an anonymous class");
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        }   
    };
    obj.display();
 }
}
