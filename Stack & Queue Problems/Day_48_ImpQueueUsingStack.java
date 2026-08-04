import java.util.Stack;

/**
 * Day_48_ImpQueueUsingStack
 */
 public class Day_48_ImpQueueUsingStack {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    public void push(int x){
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }   

    public int pop(){
        return stack1.pop();
    }

    public int peek(){
        return stack1.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }
    

    public static void main(String[] args) {
        Day_48_ImpQueueUsingStack obj=new Day_48_ImpQueueUsingStack();

        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println("Front: " + obj.peek());
        System.out.println("Pop: " + obj.pop());
        System.out.println("Front after pop: " + obj.peek());
        System.out.println("Empty: " + obj.isEmpty());

    }
}