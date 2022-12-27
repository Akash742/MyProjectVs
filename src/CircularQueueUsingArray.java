public class CircularQueueUsingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n)
        {
            this.size = n;
            arr = new int[size];
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return rear == (rear + 1) % size;
        }

        public static void add(int data)
        {
            if(isFull()){
                System.out.println("Overeflow");
                return;
            }
            if(front == -1)
            {
                front = 0;
            }
            rear = (rear +1) % size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            int res = arr[front];
            if(rear == front)
            {
                rear = front = -1;
            }
            else
            {
                front = (front+1) % size;
            }

            return res;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            
            return arr[front];
        }
    }
    public static void main(String Args[]){
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        System.out.println("Queue:-");
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
