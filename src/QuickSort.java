import java.util.*;

public class QuickSort {
    public static int partition(int arr[],int low, int high)
    {
        int pivot = arr[high];
        int i = low-1;

        for(int j = low; j<high; j++)
        {
            if(arr[j] < pivot)
            {
                //Swap
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //Swap with Pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int arr[], int low, int high) {
        if(low < high)
        {
            int pidx = partition(arr, low, high);
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
    public static void printSort(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        printSort(arr);

    }
}
