
class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id+"Techer"+name);
    }
}
public class Anony {
    public static void main(String[] args){
        Student s1 = new Student(101, "Alice"){
         
            @Override
            void display(){
                   super.display();
                System.out.println(id+" "+name+" - This is an anonymous class");
            }
        };
       
        s1.display();

    }
}