package Write_a_generic_stack_class;

/**
 * Exception thrown when an operation is performed on an empty stack.
 */
public class StackEmptyException extends Exception {

    /**
     * Creates a new StackEmptyException with the specified message.
     *
     * @param message the error message
     */
    public StackEmptyException(String message) {
        super(message);
    }
}