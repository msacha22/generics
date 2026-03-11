package Write_a_generic_stack_class;

/**
 * Test class for the generic Stack.
 * Demonstrates stack operations with different data types
 * and tests overflow and underflow scenarios.
 */
public class StackTest {

    /**
     * Main method to run stack tests.
     *
     * Tests:
     * - Integer stack
     * - String stack
     * - push, pop, peek, list
     * - StackFullException and StackEmptyException
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        // Test with Integer stack
        Stack<Integer> numberStack = new Stack<>(3);

        try {
            numberStack.push(1);
            numberStack.push(2);
            numberStack.push(3);

            System.out.println(numberStack.list()); // expected: 1;2;3
            System.out.println(numberStack.peek()); // expected: 3
            System.out.println(numberStack.pop());  // removes and prints 3
            System.out.println(numberStack.list()); // expected: 1;2

            numberStack.push(4);
            numberStack.push(5); // causes StackFullException

        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }

        // Test with String stack
        Stack<String> textStack = new Stack<>(2);

        try {
            textStack.push("Hello");
            textStack.push("World");

            System.out.println(textStack.list()); // expected: Hello;World
            System.out.println(textStack.pop());  // expected: World
            System.out.println(textStack.pop());  // expected: Hello

            textStack.pop(); // causes StackEmptyException

        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}