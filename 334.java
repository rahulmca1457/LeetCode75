class Solution {
    public boolean increasingTriplet(int[] nums) {
        // Here we can also use prefix and postfix method(minarr and maxarr)
        int firstmin = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        for(int n:nums){
            if(n<=firstmin) firstmin = n;
            else if(n<=secondmin) secondmin = n;
            else return true;
        }
        return false;
    }
}
