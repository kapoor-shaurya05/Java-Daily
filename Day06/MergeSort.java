public class MergeSort {
    public static void Conquer(int[] arr , int start , int mid , int end){
        int[] merged = new int[end - start + 1 ];

        int idx1 = start;
        int idx2 = end;
        int x = 0;

        while(idx1 <= mid && idx2 <= end){
            
            if(arr[idx1] <= arr[idx2]){
                merged[x] = arr[idx1];
                x++; idx1++;
            }
            else{
                merged[x] = arr[idx2];
                x++; idx2++;
            }
        }

        while(idx1 <= mid){
            merged[x] = arr[idx1];
        }

        while(idx2 <= end){
            merged[x] = arr[idx2];
        }

        for(int i=0 , j=start ; i<merged.length ; i++ , j++){
            arr[j] = merged[i];
        }
    }
    public static void Divide(int[] arr , int start , int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start) / 2;
        Divide(arr , start , mid);
        Divide(arr , mid+1 , end);
        Conquer(arr , start , mid , end);
    }
    public static void main(String[] args) {
        int[] arr = {6 , 3 , 9 , 5 , 2 , 8};
        int n = arr.length;
        
        Divide(arr , 0 , n-1);

        for(int i=0 ; i<n ;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
