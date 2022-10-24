import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {
    private LinkedList<Cards> stack;
    public CardStack() {
        stack = new LinkedList<Cards>();
    }
    public void push(Cards card) {
        stack.push(card);
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public Cards pop() {
        return stack.pop();
    }
    public Cards peek() {
        return stack.peek();
    }

    public void printStack() {
        ListIterator<Cards> iterator = stack.listIterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " /// ");
        }
        System.out.println();
    }
}
