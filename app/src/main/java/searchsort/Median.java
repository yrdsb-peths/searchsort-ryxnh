package searchsort;

/**
 * The median is the middle value in an ordered integer list.
 * If the size of thelist is even,the median is the mean of the two
 * middle values.
 */
public class Median {
    /**
     * Find the median of the array arr using QuickSort algorithm.
     */
    public double findQuick(int[] arr) {
        if(arr == null || arr.length == 0)
        {
            return 0.0; 
        }

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
        if(arr == null || arr.length == 0)
        {
            return 0.0;
        }

        mergeSort(arr, 0 , arr.length - 1);
        return calculateMedian(arr); 

    }

    private void mergeSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int mid = low + (high - low) / 2; 
            mergeSort(arr, low, mid); 
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);

        }
    }

    private void merge(int[]arr, int low, int mid, int high)
    {
        int[]left = new int[mid - low + 1];
        int[]right = new int[high - mid]; 

        for(int i = 0; i < left.length; i++)
        {
            left[i] = arr[low + i];
        }

        for(int i = 0; i < right.length; i++)
        {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = low; 
        while(i < left.length && j < right.length)
        {
            if(left[i] <= right[j])
            {
                arr[k++] = left[i++];
            }
            else
            {
                arr[k++] = right[j++];
            }
            
        }

        while(i < left.length)
        {
            arr[k++] = left[i++];
        }

        while(j < right.length)
        {
            arr[k++] = right[j++];
        }
    }


    /**
     * Find the median of the array arr using InsertionSort algorithm.
     */
    public double findInsertion(int[] arr)
    {
        if(arr.length == 0 || arr == null )
        {
            return 0;
        }

        insertionSort(arr); 
        return calculateMedian(arr);
    }

    private void insertionSort(int[]arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[i] > key)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = key;
        }

    }


    
}
