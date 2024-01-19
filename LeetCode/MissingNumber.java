
class Solution {
    public int missingNumber(int[] nums) {
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]) max = nums[i];
        }
        int[] duplicate = new int[max + 1];
        for(int i=0; i<nums.length; i++){
            duplicate[nums[i]] = 1;
        }
        int flag = -1;
        for (int i=0; i<duplicate.length; i++){
            if(duplicate[i] == 0){
                flag = i;
                break;
            }
        }
        if(flag == -1) return max + 1;
        else return flag;

    }
}

public class MissingNumber {
    public static void main(String[] args) {
        Solution s = new Solution();
    int res1 = s.missingNumber(new int[] {1,2,3,4});
    int res2 = s.missingNumber(new int[] {0,2,3,4});
    int res3 = s.missingNumber(new int[] {1,0,3,4});
    int res4 = s.missingNumber(new int[] {2,3,4,0});

    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);
    System.out.println(res4);
    }
}
