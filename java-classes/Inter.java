interface Data{
    public void show();
    int a =10;  // by default static and final
}
interface Data2{
    public void display();
}
interface  Data3 extends Data, Data2{
    void print();
}
class Inter implements Data3{
    @Override
    public void show(){
        System.out.println("Interface method implemented");
    }
    public void display(){
        System.out.println("Data2 interface method implemented");
    }
    public void print(){
        System.out.println("Data3 interface method implemented");
    }

    public static void main(String[] args){
        Inter obj = new Inter();
        obj.show();
        obj.display();
        obj.print();
        System.out.println(a);
    }
}