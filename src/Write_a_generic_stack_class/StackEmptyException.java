package Write_a_generic_stack_class;

// Exception thrown when popping or peeking from an empty stack
public class StackEmptyException extends Exception {

    public StackEmptyException(String message) {
        super(message);
    }
}
