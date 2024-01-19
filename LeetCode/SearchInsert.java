// https://leetcode.com/problems/search-insert-position/
import java.util.Arrays;


class Solution {
    public int searchInsert(int[] nums, int target) {
        int res = Arrays.binarySearch(nums, target);
        if(res < 0) return Math.abs(res) - 1;
        return res;
    }
}
public class SearchInsert {
    public static void main(String[] args){
        Solution s = new Solution();
        int res1 = s.searchInsert(new int[] {1,2,3,4,5}, 1);
        int res2 = s.searchInsert(new int[] {0,1,3,4,5}, 2);
        int res3 = s.searchInsert(new int[] {1,2,3,4,5,13}, 11);
        int res4 = s.searchInsert(new int[] {1,2,3,4,5,13}, 101);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }
}
