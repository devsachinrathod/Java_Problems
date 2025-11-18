public class Gen<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
    void getValue(){
        System.out.println(value);
    }
    
public static void main(String[] args) {
        Gen<Integer> intBox = new Gen<>();
        intBox.set(10);
        System.out.println(intBox.get());
        intBox.getValue();

        Gen<String> strBox = new Gen<>();
        strBox.set("Hello");
        System.out.println(strBox.get());
    }
}
