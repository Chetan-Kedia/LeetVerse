

// Defining a user defined exception by extending the Exception class
class NegativeValException extends Exception {
    public NegativeValException(String message) {
        super(message);
    }
}


public class ThrowvsThrowsWithUserDefinedException {
    // Method that throws a user defined exception
    public static void riskyMethod(int value) throws NegativeValException {
        if (value < 0) {
            throw new NegativeValException("Negative value is not allowed: " + value);
        } else {
            System.out.println("Value is acceptable: " + value);
        }
    }

    public static void main(String[] args) {
        try {
            riskyMethod(-5); // This will throw the custom exception
        } catch (NegativeValException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        try {
            riskyMethod(10); // This will not throw an exception
        } catch (NegativeValException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
