 interface  b{
    public void show();

    int a =10;  // by default static and final


}

class Ab implements  b{
    @Override
    public void show(){
        System.out.println("A:"+ a);
        System.out.println("Abstract class method implemented");
    }

    public static void main(String[] args){
        Ab obj = new Ab();
        obj.show();
    }
}