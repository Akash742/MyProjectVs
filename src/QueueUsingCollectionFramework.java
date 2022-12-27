import java.util.*;

public class QueueUsingCollectionFramework {
    public static void main(String Args[]){
        //Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.add(4);
        q.add(6);
        q.add(45);
        q.add(65);
        q.add(56);
        q.remove();
        q.add(23);
        q.remove();
        q.add(67);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
