
interface labaExpression {

   String exper();

}

class Lab {

void display() {
    System.out.println("This is display method");
}
    public static void main(String[] args) {
        Lab L1 = new Lab();
        L1.display();

        labaExpression obj = () -> "Hello, this is a lambda expression!";
        System.out.println(obj.exper());

    }
}
