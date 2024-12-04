package searchsort;

public class Median {
    /**
     * Find the median of the array arr using QuickSort algorithm.
     */
    public double findQuick(int[] arr) {
        quickSort(arr, 0, arr.length -1);
        return calculateMedian(arr);
    }

    private void quickSort(int[]arr, int low, int high)
    {
        if(low < high)
        {
            int pivotIndex = partition(arr, low, high); 
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high); 
        }
    }

    private int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low; 
        int j = high + 1; 

        while(true)
        {
            while(++i <= high && arr[i] < pivot); 
            while(--j >= low && arr[j] > pivot);
            
            if(i >= j) break; 
            
            swap(arr,i , j); 

        }
        swap(arr, low, j);
        return j;
    }

    private void swap(int[]arr, int i, int j) 
    {
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;

    }


    private double calculateMedian(int[]arr)
    {
        int n = arr.length; 
        if(n % 2 == 1)
        {
            return arr[n / 2];

        }
        else
        {
            return(arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
        
    }


    /**
     * Find the median of the array arr using MergeSort algorithm.
     */
    public double findMerge(int[] arr)
    {


    }



    /**
     * Find the median of the array arr using InsertionSort algorithm.
     */
    public double findInsertion(int[] arr) {
        return 0;
    }

}
