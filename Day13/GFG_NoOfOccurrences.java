public class GFG_NoOfOccurrences {
    int firstOccur(int[] arr , int x){
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == x){
                result = mid;
                end = mid - 1;
            }
            else if(arr[mid] > x){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return result;
    }

    int lastOccur(int[] arr , int x){
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == x){
                result = mid;
                start = mid + 1;
            }
            else if(arr[mid] > x){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,3,4,7,8,8};
        int x = 2;
        GFG_NoOfOccurrences obj = new GFG_NoOfOccurrences();
        int first = obj.firstOccur(arr, x);
        int last = obj.lastOccur(arr, x);
        if(first == -1 || last == -1){
            System.out.println("Element " + x + " not found in the array.");
        } else {
            int count = last - first + 1;
            System.out.println("Number of occurrences of " + x + " is: " + count);
        }
    }    
}
