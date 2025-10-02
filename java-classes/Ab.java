abstract class b{
    abstract void show();

}

class Ab extends b{
    @Override
    void show(){
        System.out.println("Abstract class method implemented");
    }

    public static void main(String[] args){
        Ab obj = new Ab();
        obj.show();
    }
}