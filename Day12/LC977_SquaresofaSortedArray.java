public class LC977_SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        int i=0;
        int j=nums.length-1;

        int k=res.length-1;

        while(i<=j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                res[k] = nums[i] * nums[i];
                i++;
                k--;
            }
            else{
                res[k] = nums[j] * nums[j];
                j--;
                k--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        LC977_SquaresofaSortedArray obj = new LC977_SquaresofaSortedArray();
        int[] result = obj.sortedSquares(nums);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
