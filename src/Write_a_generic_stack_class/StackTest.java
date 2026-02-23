package Write_a_generic_stack_class;

public class StackTest {

    public static void main(String[] args) {

        // Test with Integer stack
        Stack<Integer> numberStack = new Stack<>(3);

        try {
            numberStack.push(1);
            numberStack.push(2);
            numberStack.push(3);

            System.out.println(numberStack.list()); // 1;2;3
            System.out.println(numberStack.peek()); // 3
            System.out.println(numberStack.pop());  // removes 3
            System.out.println(numberStack.list()); // 1;2

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

            System.out.println(textStack.list()); // Hello;World
            System.out.println(textStack.pop());  // World
            System.out.println(textStack.pop());  // Hello

            textStack.pop(); // should cause StackEmptyException

        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
