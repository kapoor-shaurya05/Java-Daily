import java.util.*;

public class LC349_IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int num : nums1){
            s1.add(num);
        }
        for(int num : nums2){
            s2.add(num);
        }

        //Intersection 
        int[] res = new int[s1.size()];
        int k = 0;

        for(int num : s1){
            if(s2.contains(num)){
                res[k] = num;
                k++;
            }
        }
            
        return Arrays.copyOfRange(res , 0 , k);
    }

    public static void main(String[] args) {
        LC349_IntersectionofTwoArrays obj = new LC349_IntersectionofTwoArrays();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(obj.intersection(nums1, nums2)));
    }
}