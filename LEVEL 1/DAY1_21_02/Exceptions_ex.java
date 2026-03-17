import java.io.FileReader;
import java.io.IOException;

public class Exceptions_ex {
    public static void main(String[] args) {

        // Checked Exception Example - Try, Catch, Finally with Cleanup
        // FileReader file = new FileReader("abc.txt");  // This line will cause a compile-time error because FileReader constructor throws IOException which is a checked exception and must be handled or declared to be thrown.
        try {
            FileReader file1 = new FileReader("abc.txt");
            int character;
            while ((character = file1.read()) != -1) {
                System.out.print((char) character);
            }
            file1.close();
        } catch (IOException e) {
            System.out.println("File is missing: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute, even if an exception occurs.");
        }



        // try with Resources - Automatically Closes Resources
        try (FileReader file2 = new FileReader("abc.txt")) {
            int character;
            while ((character = file2.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("File is missing: " + e.getMessage());
        }




        // Unchecked Exception Example
        int result = 10/0;  // JVM will not explicitly tell to handle this exception but will throw ArithmeticException at runtime
        System.out.println("Result: " + result);

    }
}
