class outerClass{
  
    void show(){
        System.out.println("This is the outer class");
    }

    class NestedInnerClass{
        void display(){
            System.out.println("This is a nested inner class");
        }
    }

    public static void main(String[] args){
      outerClass outer = new outerClass();
      outer.show();
      outerClass.NestedInnerClass inner = outer.new NestedInnerClass();
      inner.display();
    }
}