package Write_a_generic_stack_class;

/**
 * Simple generic stack implementation (LIFO).
 */
public class Stack<T> {

    private Object[] data; // array to store elements
    private int top;       // current number of elements

    // Default constructor with size 10
    public Stack() {
        this(10);
    }

    // Constructor with custom size
    public Stack(int size) {
        data = new Object[size]; // cannot create generic array
        top = 0;
    }

    // Adds an element to the top of the stack
    public void push(T value) throws StackFullException {
        if (top == data.length) {
            throw new StackFullException("Stack is full");
        }
        data[top] = value;
        top++;
    }

    // Removes and returns the top element
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (top == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        top--;
        T value = (T) data[top]; // cast from Object to T
        data[top] = null;        // free memory
        return value;
    }

    // Returns the top element without removing it
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (top == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) data[top - 1]; // cast required
    }

    // Returns all elements separated by ;
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
// Qovgim-gupwa5-guhboc