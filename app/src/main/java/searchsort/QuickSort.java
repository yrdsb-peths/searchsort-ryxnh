package searchsort;

public class QuickSort extends Sort {
    /**
     * Sort the array arr using quick sort algorithm.
     */
    @Override
    public void sort(int[] arr) {

    }

    /*
     * Sort the subarray arr[low..high] using quick sort algorithm.
     */
    private void quickSort(int[] arr, int low, int high) {

    }

    /*
     * Partition the subarray arr[low..high] using the last element as pivot.
     * Return the index of the pivot element after partition.
     */
    private int partition(int[] arr, int low, int high)
    {
        int i = low;
        int j = high + 1;
        while(true)
        {
            while(arr[i++] < arr[low])
            {
                if(i == high)
                {
                    break; 
                }
            }
            while(arr[j--] > arr[low])
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

        }

        return j;
    }

}
