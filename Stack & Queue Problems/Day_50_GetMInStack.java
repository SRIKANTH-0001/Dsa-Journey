//Problem No: is 155
//pName:Min Stack

import java.util.Stack;

public class Day_50_GetMInStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> min_value=new Stack<>();

    public void push(int val){
        if(stack.isEmpty()||val<=min_value.peek()){
            min_value.push(val);
        }
        stack.push(val);
    }

    public void pop(){
        if(stack.peek()==min_value.peek()){
            min_value.pop();
        }
        stack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int minStack(){
        return min_value.peek();
    }

    public static void main(String[] args) {
        Day_50_GetMInStack obj=new Day_50_GetMInStack();

        obj.push(5);
        obj.push(2);
        obj.push(8);
        obj.push(6);

        System.out.println("Is the stack Empty : "+obj.isEmpty());

        System.out.println("Before pop :"+obj.top());
        obj.pop();
        System.out.println("After pop : "+obj.top());
        System.out.println("Minimum value in the stack : "+obj.minStack());

    }
}
