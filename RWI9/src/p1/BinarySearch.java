package p1;


class BinarySearch {
  
    int binarySearch(int arr[], int key)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
   
            if (arr[mid] == key)
                return mid;
         
            if (arr[mid] < key)
                low = mid + 1;
         
            else
                high = mid - 1;
        }

        return -1;
    }


    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        // n = arr.length;
        int key = 10;
        int result = ob.binarySearch(arr, key);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at index:" + result);
    }
}