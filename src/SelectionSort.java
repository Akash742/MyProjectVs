import java.util.*;

public class SelectionSort {
    public static void printArray(int arr[])
    {   System.out.print("Sorted Array=");
        for(int l = 0; l<arr.length; l++)
        {
            System.out.print(arr[l]+" ");
        }
    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number=");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the numbers=");
        for(int i = 0; i<n; i++)
        {
            arr[i] =sc.nextInt();
        }

        for(int j = 0; j<arr.length-1; j++)
        {   int smallest = j;
            for(int k = j+1; k<arr.length; k++)
            {
                if(arr[smallest] > arr[k])
                {
                    smallest = k;
                }

            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[j];
            arr[j] = temp;
        }

        printArray(arr);
    }
}
