public class GFG_FirstAndLastOccurrences{
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
        GFG_FirstAndLastOccurrences obj = new GFG_FirstAndLastOccurrences();
        int first = obj.firstOccur(arr, x);
        int last = obj.lastOccur(arr, x);
        System.out.println("First Occurrence of " + x + " is at index: " + first);
        System.out.println("Last Occurrence of " + x + " is at index: " + last);
    }
}