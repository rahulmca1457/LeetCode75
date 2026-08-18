class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] arr = new int[51];
        int left = 0;
        int right;
        for(right=0;right<k;right++){
            if(arr[nums[right]]>0) continue;
            arr[nums[right]]++;
        }
        left++;
        while(right<nums.length){
            for(int i=left;i<=right;i++){
                arr[nums[i]]++; 
            }
            left++;
            right++;
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }
}
