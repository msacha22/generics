package generic_methods;

/**
 * Utility class providing generic helper methods for array operations.
 */
public class GenericUtils {

    /**
     * Reverses the order of the elements in the given array.
     * <p>
     * The method performs the reversal directly inside the provided array,
     * meaning no additional array is created. The first element becomes the
     * last, the last becomes the first, and so on.
     *
     * @param <T>   the type of elements stored in the array
     * @param array the array whose elements should be reversed
     */
    public static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    /**
     * Calculates the sum of all elements in an array containing numbers.
     * <p>
     * The method accepts arrays whose element types extend {@link Number}
     * (for example {@link Integer}, {@link Double}, {@link Float}, etc.).
     * Each value is converted to double using {@code doubleValue()} and
     * added to the result.
     *
     * @param <T>   a type that extends {@link Number}
     * @param array the array containing numeric values
     * @return the sum of all elements as a double
     */
    public static <T extends Number> double sum(T[] array) {
        double result = 0.0;

        for (T value : array) {
            result += value.doubleValue();
        }

        return result;
    }
}