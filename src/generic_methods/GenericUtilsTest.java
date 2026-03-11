package generic_methods;

/**
 * Test class used to demonstrate and verify the functionality
 * of the GenericUtils utility methods.
 */
public class GenericUtilsTest {

    /**
     * Entry point of the test program.
     * It creates example arrays and calls the methods
     * from the GenericUtils class to demonstrate their behavior.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        // Test reverse with Integer values
        Integer[] numbers = {1, 2, 3, 4, 5};
        GenericUtils.reverse(numbers);

        System.out.println("Reversed Integer array:");
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Test reverse with String values
        String[] words = {"apple", "banana", "cherry"};
        GenericUtils.reverse(words);

        System.out.println("Reversed String array:");
        for (String w : words) {
            System.out.print(w + " ");
        }
        System.out.println();

        // Test sum with Integer values
        Integer[] intValues = {10, 20, 30};
        double intSum = GenericUtils.sum(intValues);
        System.out.println("Sum of Integer array: " + intSum);

        // Test sum with Double values
        Double[] doubleValues = {1.5, 2.5, 3.0};
        double doubleSum = GenericUtils.sum(doubleValues);
        System.out.println("Sum of Double array: " + doubleSum);
    }
}