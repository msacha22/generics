package Write_a_generic_stack_class;

/**
 * Exception thrown when an element is pushed onto a full stack.
 */
public class StackFullException extends Exception {

    /**
     * Creates a new StackFullException with the specified message.
     *
     * @param message the error message
     */
    public StackFullException(String message) {
        super(message);
    }
}