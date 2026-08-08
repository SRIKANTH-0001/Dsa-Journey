import java.util.Stack;

/**
 * Day_52_RevPolisNotaion
 */
public class Day_52_RevPolisNotaion {

    public static void main(String[] args) {
        String[] tokens={"2","1","+","3","*"};
        int result=revPolishNotaion(tokens);
        System.out.println(result);
    }

    public static int revPolishNotaion(String[] tokens){
        Stack<String> stack=new Stack<>();

        for (String token : tokens) {
            if(isOperator(token)){
                int num2=Integer.parseInt(stack.pop());
                int num1=Integer.parseInt(stack.pop());
                int sum=0;

                if(token=="+"){
                    sum=num1+num2;
                }else if(token=="-"){
                    sum=num1-num2;
                }else if(token=="*"){
                    sum=num1*num2;
                }else if(token=="/"){
                    sum=num1/num2;
                }
                stack.push(Integer.toString(sum));
            }
            else{
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.peek());
    }

    private static boolean isOperator(String token) {
        if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
            return true;
        }
        else{
            return false;
        }
    }
}