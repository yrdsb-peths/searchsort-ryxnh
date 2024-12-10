package searchsort;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */

    @Override
    public int recursiveFind(int[] arr, int target)
    {
        return recursiveFind(arr, target, 0, arr.length - 1);
    }

    public int recursiveFind(int[] arr, int target, int low, int high)
    {
        if (low > high) {
            return -1; 
        }
    
        int mid = (low + high) / 2; 
        int cur = arr[mid];
    
        if (cur == target)
        {
            return mid; 
        } else if (cur < target)
        {
            return recursiveFind(arr, target, mid + 1, high);
        } else
        {
            return recursiveFind(arr, target, low, mid - 1); 
        }
    }

    @Override
    public int find(int[] arr, int target)
    {
        int low = 0; 
        int high = arr.length - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2; 
            int cur = arr[mid];
            
            if(cur == target) 
            {
                return mid; 
            }
            else if(cur < target)
            {
                low = mid + 1; 
            }
            else
            {
                high = mid -1; 
            }
        }

        return -1;
    }
}
