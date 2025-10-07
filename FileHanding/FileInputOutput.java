
import java.io.BufferedReader;
import java.io.FileReader;
// import java.io.exceptions;

class FileInputOutput {

    public static void main(String[] args) {
        System.out.println("File Input/Output operations will be demonstrated here.");
        try (BufferedReader br = new BufferedReader(new FileReader("student-admission.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error handling file: " + e);
        }
    }
}
