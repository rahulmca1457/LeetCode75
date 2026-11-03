class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int closet = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            left = i+1;
            right = nums.length-1;
            while(left<right){
                int curr = nums[i]+nums[left]+nums[right];
                if(curr==target) return curr;
                if(Math.abs(curr-target)<min){
                    min = Math.abs(curr-target);
                    closet = curr;
                }
                if(curr<target){
                    left++;
                }
                else{
                    right--;
                }
            }
            
        }
        return closet;
    }
}
