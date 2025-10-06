
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class StudentInfo {

    String name;
    Integer fees;
    Integer age;
    String address;
    String academic;
}

class StudentMethod extends StudentInfo {
    // StudentMethod(String sname, Integer sfee, Integer sage, String saddress, String sacademic) {
    //     this.name = sname;
    //     this.fees = sfee;
    //     this.age = sage;
    //     this.address = saddress;
    //     this.academic = sacademic;
    // }

    void getInputs() {
        System.out.println("Student Name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        System.out.println("Enter Student Age: ");
        age = sc.nextInt();

        System.out.println("Enter Student Fees: ");
        fees = sc.nextInt();

        System.out.println("Enter Student Address: ");
        address = sc.next();

        System.out.println("Enter Student Academic: ");
        academic = sc.next();
    }

    void storeData() {
        File fileObj = new File("student-admission.txt");
        try (FileWriter file = new FileWriter(fileObj, true)) { // append = true
            String path = fileObj.getAbsolutePath();
            System.out.println("this is the path for where is file written" + path);
            file.write("Student Name: " + name + System.lineSeparator());
            file.write("Student Fees: " + fees + System.lineSeparator());
            file.write("Student Age: " + age + System.lineSeparator());
            file.write("Student Address: " + address + System.lineSeparator());
            file.write("Student Academic: " + academic + System.lineSeparator());
            file.write(System.lineSeparator()); // blank line
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //  static void ReadData() {
    //       // read data from file
    //       File fileObj = new File("student-admission.txt");
    //       try (Scanner fileReader = new Scanner(fileObj)) {
    //           while (fileReader.hasNextLine()) {
    //               String data = fileReader.nextLine();
    //               System.out.println(data);
    //           }
    //       } catch (IOException e) {
    //           e.printStackTrace();
    //       }
    //   }

    static void readByBufferedReader() {
        // read data from file using BufferedReader
        File fileObj = new File("student-admission.txt");
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(fileObj))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile() {
        File fileObj = new File("student-admission.txt");
        if (fileObj.delete()) {
            System.out.println("Deleted the file: " + fileObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public static void main(String[] args) {
        StudentMethod m1 = new StudentMethod();
        m1.getInputs();
        m1.storeData();
        readByBufferedReader();
        deleteFile();
    }
}
