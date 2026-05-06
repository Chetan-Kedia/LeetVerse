package leetverseS2;

import java.util.Arrays;
import java.util.HashSet;

public class L217 {
    public static void main(String[] args) {
        int[] nums={1,3,5,2,6,7,1,4,8};
        //System.out.println(containsDuplicate1(nums));
        //System.out.println(containsDuplicate2(nums));
        System.out.println(containsDuplicate3(nums));
    }
    public static boolean containsDuplicate1(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicate3(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
