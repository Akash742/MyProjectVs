class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        //When list is present
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

       Node currNode = head;
       while(currNode.next != null)
       {
           currNode = currNode.next;
       }
       currNode.next = newNode;
    }

    public void printList(){
        Node currNode = head;
        if(head == null)
        {
            System.out.print("List is   Empty.");
            return;
        }

        while(currNode != null)
        {
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
        System.out.println();

    }

    public void printMiddleElement()
    {
        if(head == null)
        {
            System.out.print("Empty List");
        }
        int i = 0;
        Node currNode = head;
        String [] str = new String [100];

        while(currNode.next != null)
        {
            str[i++]= currNode.data;
            currNode = currNode.next;
        }
        System.out.println();
        System.out.println(str[i/2]);
       
    }
    
    public void deleteFirst(){
        if(head == null)
        {
            System.out.println("Empty List");
        }
        size--;
        head = head.next;
    }

    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("Empty List");
        }

        size--;

        if(head.next == null)
        {
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }

        secondLastNode.next = null;
    }

    public int getSize()
    {
        return size;
    }

    public void reverseIterate()
    {
        if(head == null || head.next == null)
        {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null)
        {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //Update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }


    public static void main(String Args[])
    {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");

        list.addLast("List.");

        list.addFirst("This");

        list.printList();

        list.head = list.reverseRecursive(list.head);

        //list.reverseIterate();
        list.printList();

        list.printMiddleElement();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

        list.addFirst("This");
        System.out.println(list.getSize());

    }
    
}
