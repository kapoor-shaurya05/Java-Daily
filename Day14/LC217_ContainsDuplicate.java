import java.util.*;
public class LC217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length - 1 ; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LC217_ContainsDuplicate obj = new LC217_ContainsDuplicate();
        int[] nums = {1,2,3,1};
        System.out.println(obj.containsDuplicate(nums));
    }
}
