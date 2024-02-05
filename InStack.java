import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

    public class InStack {
        private List<Integer> stack;

        public InStack() {
            this.stack = new ArrayList<>();
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }

        public void push(int value) {
            stack.add(value);
            System.out.println("Pushed " + value + " onto the stack");
        }

        public int pop() {
            if (!isEmpty()) {
                int poppedValue = stack.remove(stack.size() - 1);
                System.out.println("Popped " + poppedValue + " from the stack");
                return poppedValue;
            } else {
                System.out.println("Error: Stack is empty. Cannot pop.");
                throw new EmptyStackException();
            }
        }

        public static void main(String[] args) {
            // Example usage:
            InStack myStack = new InStack();

            myStack.push(5);
            myStack.push(10);
            myStack.push(15);

            // Check if the stack is empty
            System.out.println("Is the stack empty? " + myStack.isEmpty());

            // Pop elements from the stack
            int poppedItem1 = myStack.pop();
            int poppedItem2 = myStack.pop();

            // Check if the stack is empty after popping
            System.out.println("Is the stack empty after popping? " + myStack.isEmpty());
        }
    }

