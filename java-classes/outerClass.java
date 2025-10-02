
class outerClass {

    outerClass() {
        System.out.println("Outer class constructor called");
    }

    void show() {
        System.out.println("This is the outer class");
    }

    class NestedInnerClass extends  outerClass{

        void display(){
            super.show();
            System.out.println("This is a nested inner class");
        }

        class DeepNestedClass {
            int b = 10;
            void print() {
                System.out.println("This is a deep nested class");
            }
        }
    }

    public static void main(String[] args) {
        outerClass outer = new outerClass();
        outer.show();
        outerClass.NestedInnerClass inner = outer.new NestedInnerClass();
        inner.display();
        outerClass.NestedInnerClass.DeepNestedClass deep = inner.new DeepNestedClass();
        deep.print();
        System.out.println(deep.b);
    }
}
