import java.util.*;

public class SubsetOf_n_NaturalNos {
    public static void printSubSet(ArrayList<Integer> subSet)
    {
        for(int i = 0; i<subSet.size(); i++)
        {
            System.out.print(subSet.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubSet(int n, ArrayList<Integer> subSet)
    {
        if(n == 0)
        {
            printSubSet(subSet);
            return;
        }
        // Add
        subSet.add(n);
        findSubSet(n-1, subSet);

        //Don't Add
        subSet.remove(subSet.size()-1);
        findSubSet(n-1, subSet);
    }
    public static void main(String Args[])
    {
        int n = 3;
        ArrayList<Integer> subSet = new ArrayList<>();
        findSubSet(n, subSet);
    }
    
}
