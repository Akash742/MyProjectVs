import java.util.*;

public class StackUsingArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size() == 0;
        }

        public void push(int data){
            list.add(data);
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return  top;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }

            return list.get(list.size()-1);
        }
    }
    public static void main(String Args[]){
        Stack stack = new Stack();
        stack.push(34);
        stack.push(54);
        stack.push(67);
        stack.push(23);

        while(!stack.isEmpty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
