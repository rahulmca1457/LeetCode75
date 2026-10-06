class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return 1;
            sum+=nums[i];
            while(sum>=target){
                len = Math.min(len,i-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(len == Integer.MAX_VALUE) return 0;
        return len;
    }
}
