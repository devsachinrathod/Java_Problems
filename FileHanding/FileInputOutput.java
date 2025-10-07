
import java.io.FileInputStream;
import java.io.FileOutputStream;
// import java.io.exceptions;

class FileInputOutput {

    public static void main(String[] args) {
        System.out.println("File Input/Output operations will be demonstrated here.");
        try {
            FileOutputStream fout = new FileOutputStream("student-admission.txt");
            String data = "this is the data";
            fout.write(data.getBytes());
            fout.close();
            FileInputStream file = new FileInputStream("student-admission.txt");
            int i;
            while ((i = file.read()) != -1) {
                System.out.print((char) i);
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Error handling file." + e);
        }
    }
}
