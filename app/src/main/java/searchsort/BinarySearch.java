package searchsort;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */
    @Override
    public int find(int[] arr, int target) {
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
            else{
                high = mid -1; 
            }
        }

        return -1;
    }
}
