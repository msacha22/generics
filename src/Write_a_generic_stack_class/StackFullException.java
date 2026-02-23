package Write_a_generic_stack_class;

// Exception thrown when pushing to a full stack
public class StackFullException extends Exception {

    public StackFullException(String message) {
        super(message);
    }
}
