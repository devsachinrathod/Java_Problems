
// import java.util.Arrays;
import java.util.ArrayList;

public class array {

    public static void main(String[] args) {

        String[] names = {"sachin", "dipak", "laya", "tanu"};

        ArrayList<String> newArr = new ArrayList<>();

        for(int i = 0; i < names.length; i++) {
            if (names[i].equals("laya") || names[i].equals("tanu")) {
                newArr.add(names[i]);

            }

        }
        System.out.println(newArr);
    }

}
