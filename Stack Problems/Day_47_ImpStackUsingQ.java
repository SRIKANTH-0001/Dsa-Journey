import java.util.LinkedList;
import java.util.Queue;

public class Day_47_ImpStackUsingQ {

    Queue<Integer> q=new LinkedList<>();
    
    public void push(int x) {
        q.add(x);
        int k=q.size();

        for(int i=0;i<k-1;i++){
            Integer first=q.remove();
            q.add(first);
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        Day_47_ImpStackUsingQ stack = new Day_47_ImpStackUsingQ();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top after pop: " + stack.top());
        System.out.println("Empty: " + stack.empty());
    }
}

