class LinkedListPrac{
    Node head;
    private int size;
    LinkedListPrac()
    {
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

public void addFirst(String data)
{
    Node newNode = new Node(data);
    
    if(head == null)
    {
        head = newNode;
        return;
    }

    newNode.next = head;
    head = newNode;
}

public void addLast(String data)
{
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

public void deleteFirst()
{
    if(head == null)
    {
        System.out.println("Empty List");
    }
    size--;
    head = head.next;
}

public void deleteLast(){
    if(head == null)
    {
        System.out.println("Empty List");
        return;
    }
    size--;
    if(head.next == null)
    {
        head = null;
    }

    Node secondLastNode = head;
    Node lastNode = head.next;

    while(lastNode.next != null)
    {
        secondLastNode = secondLastNode.next;
        lastNode = lastNode.next;
    }
    secondLastNode.next = null;
}

public void middleElement() {
    if(head == null)
    {
        System.out.println("Empty List");
        return;
    }

    String str[] = new String[100];
    int i = 0;
    Node currNode = head;
    while(currNode.next != null)
    {
        str[i++] = currNode.data;
        currNode = currNode.next;
    }

    System.out.println(str[i/2]);
}

public void reverseList()
{
    if(head == null || head.next == null)
    {
        System.out.println("EMPTY LIST");
        return;
    }

    Node prevNode = head;
    Node currNode = head.next;

    while(currNode != null)
    {
        Node nextNode = currNode.next;
        currNode.next = prevNode;

        prevNode = currNode;
        currNode = nextNode;
    }

    head.next = null;
    head = prevNode;
}

public void printList(){
    if(head == null)
    {
        System.out.println("Empty List");
        return;
    }

    Node currNode = head;
    while(currNode != null)
    {
        System.out.print(currNode.data + "-->");
        currNode = currNode.next;
    }
    System.out.print("NULL");
    System.out.println();
}

public int getSize()
{
    return size;
}

public static void main(String Args[])
{
    LinkedListPrac list = new LinkedListPrac();
    list.addFirst("Akash");
    list.addFirst("The");
    list.addLast("Dey");
    list.printList();
    System.out.println(list.getSize());
    list.deleteFirst();
    list.deleteLast();
    list.printList();

    list.addFirst("The");
    list.addLast("Dey");

    list.reverseList();
    list.printList();
    list.middleElement();

}
}