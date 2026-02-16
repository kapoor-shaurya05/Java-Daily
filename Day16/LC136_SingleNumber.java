import java.util.*;

public class LC136_SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();

        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num , 0);
            }
            map.put(num , map.get(num) + 1);
        }

        for(int num : nums){
            if(map.get(num) == 1){
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        LC136_SingleNumber obj = new LC136_SingleNumber();
        System.out.println(obj.singleNumber(nums));
    }
}
