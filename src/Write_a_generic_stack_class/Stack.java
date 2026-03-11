package Write_a_generic_stack_class;

/**
 * Generic stack implementation based on the LIFO principle (Last In, First Out).
 * Uses an internal Object array to store elements.
 *
 * @param <T> the type of elements stored in the stack
 */
public class Stack<T> {

    private Object[] data; // array to store elements
    private int top;       // current number of elements

    /**
     * Creates a stack with a default capacity of 10.
     */
    public Stack() {
        this(10);
    }

    /**
     * Creates a stack with the specified capacity.
     *
     * @param size the maximum number of elements the stack can hold
     */
    public Stack(int size) {
        data = new Object[size]; // cannot create generic array
        top = 0;
    }

    /**
     * Pushes an element onto the stack.
     *
     * @param value the element to add
     * @throws StackFullException if the stack is full
     */
    public void push(T value) throws StackFullException {
        if (top == data.length) {
            throw new StackFullException("Stack is full");
        }
        data[top] = value;
        top++;
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return the removed element
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (top == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        top--;
        T value = (T) data[top];
        data[top] = null; // free memory
        return value;
    }

    /**
     * Returns the top element without removing it.
     *
     * @return the top element
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (top == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) data[top - 1];
    }

    /**
     * Returns all elements as a semicolon-separated string.
     *
     * @return a string containing all stack elements
     */
    public String list() {
        String result = "";
        for (int i = 0; i < top; i++) {
            result += data[i];
            if (i < top - 1) {
                result += ";";
            }
        }
        return result;
    }
}