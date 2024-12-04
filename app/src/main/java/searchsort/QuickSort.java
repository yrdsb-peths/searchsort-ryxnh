package searchsort;

public class QuickSort extends Sort {
    /**
     * Sort the array arr using quick sort algorithm.
     */
    @Override
    public void sort(int[] arr)
    {
        if(arr == null || arr.length <= 1)
        {
            return;
        }
        quickSort(arr, 0 , arr.length - 1);
    }

    /*
     * Sort the subarray arr[low..high] using quick sort algorithm.
     */
    private void quickSort(int[] arr, int low, int high) {
        
        if(low < high)
        {
            int pivotIndex = partition(arr, low, high);
            
            quickSort(arr, low, pivotIndex - 1); 
            quickSort(arr, pivotIndex + 1, high);

        }
       
    }

    /*
     * Partition the subarray arr[low..high] using the last element as pivot.
     * Return the index of the pivot element after partition.
     */
    private int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high + 1;
        while(true)
        {
            while(arr[i++] < pivot)
            {
                if(i == high)
                {
                    break; 
                }
            }
            while(arr[j--] > pivot)
            {
                if(j == low)
                {
                    break; 
                }
            }
            if(i >= j)
            {
                break; 
            }
            
            swap(arr, i , j);
        }
        
        swap(arr, low, j);
        return j;
    }

    public void swap(int[]arr, int i, int j)
    {
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp;
    }
}
