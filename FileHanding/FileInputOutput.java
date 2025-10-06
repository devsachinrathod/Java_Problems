import java.io.FileInputStream;
// import java.io.exceptions;
class FileInputOutput {
    public static void main(String[] args) {
        System.out.println("File Input/Output operations will be demonstrated here.");

       try {
            FileInputStream  file = new FileInputStream("student-admission.txt");
            int i;
            while ((i = file.read()) != -1) {
                System.out.print((char) i);
            }
       } catch (Exception e) {
       }
        // Add file handling code as needed
    }
}