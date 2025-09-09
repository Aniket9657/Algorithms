import java.util.Stack;

class StackEx {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack after pushes: " + stack);

        // Peek top element
        System.out.println("Top element (peek): " + stack.peek());

        // Pop element from stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Search element (returns 1-based position from top, -1 if not found)
        int pos = stack.search(20);
        if (pos != -1) {
            System.out.println("Element 20 found at position: " + pos);
        } else {
            System.out.println("Element 20 not found");
        }

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Size of stack
        System.out.println("Current stack size: " + stack.size());
    }
}
