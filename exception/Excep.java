
class Excep {
    // public static void main(String[] args) {
    //     try {
    //        int arr[] = { 1, 2, 3 };
    //        System.out.println(arr[5]);
    //     } catch (ArrayIndexOutOfBoundsException e) {
    //         System.out.println("Caught an array exception: " + e.getMessage());
    //     } finally {
    //         System.out.println("Execution completed.");
    //     }
    // }

    public void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be at least 18.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
            try {
      int[] numbers = {1, 2, 3};
      System.out.println(numbers[1]);  // ArrayIndexOutOfBoundsException
      int result = 10 / 0;              // ArithmeticException
    } 
    catch ( ArithmeticException | ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index does not exist&&& Arithmetic Exception: " + e.getMessage());
    } 
    catch (Exception e) {
      System.out.println("Something else went wrong.");
    }

        Excep obj = new Excep();
        try {
            obj.checkAge(12);
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Caught a general exception: " + e.getMessage());
        }
        finally {
            System.out.println("Execution completed.");
        }
    }
}
