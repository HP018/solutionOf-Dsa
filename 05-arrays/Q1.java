import java.util.Arrays;
// https://leetcode.com/problems/build-array-from-permutation/
public class Q1{
    public static void main(String[] args) {
        int[] num = {1,2,3,0};
        System.out.println(Arrays.toString(buildArray(num)));
    }

    private static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}