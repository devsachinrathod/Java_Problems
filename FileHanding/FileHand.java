
import java.io.File;
import java.io.FileWriter;

class FileHand {

    public static void main(String[] args) {
        File file = new File("example.txt");

        System.out.println("File path: " + file.getAbsolutePath());

        
        try {
                    FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a sample text.");
            writer.close();
            System.out.println("File handling example");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
