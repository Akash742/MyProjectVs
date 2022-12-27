import java.util.*;

public class LinkList {
    public static void main(String Args[])
    {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.add("List.");
        list.addFirst("This");

        for(int i = 0; i<list.size(); i++)
        {
            System.out.print(list.get(i)+"-->");
        }
        System.out.print("NULL");
        System.out.println();
        list.remove();
        list.removeLast();

        System.out.println(list.size());

        for(int i = 0; i<list.size(); i++)
        {
            System.out.print(list.get(i)+"-->");
        }
        System.out.print("NULL");

        //System.out.print(list);
    }
}
