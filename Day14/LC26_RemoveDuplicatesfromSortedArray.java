public class LC26_RemoveDuplicatesfromSortedArray {

        public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int j=1 ; j<nums.length ; j++){
            if(nums[j] != nums[j - 1]){
                nums[k] = nums[j];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
    LC26_RemoveDuplicatesfromSortedArray obj = new LC26_RemoveDuplicatesfromSortedArray();
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    System.out.println(obj.removeDuplicates(nums));
    }
}
