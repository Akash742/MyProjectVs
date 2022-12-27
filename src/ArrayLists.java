import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main (String Args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        //Add
        list.add(0);
        list.add(1);
        list.add(6);

        //Print
        System.out.println(list);

        //Print Indiviual Element
        System.out.println(list.get(1));

        // Print size of ArrayList
        System.out.println(list.size());
        
        // Add element in particular index
        list.add(1,7);

        //Iterating in ArrayList
        for(int i = 0; i<list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println(list.size());

        //Delete element in ArrayList
        list.remove(2);

        //Change the value in particular index
        list.set(0,4);

        System.out.println(list);

        //Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
