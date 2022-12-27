import java.util.*;

public class StackUsingCollectionFramework {
    public static void main(String Args[]){
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(6);
        stack.push(56);
        stack.push(43);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
