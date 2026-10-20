class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] pairs = new int[spells.length];
        int i=0;
        Arrays.sort(potions);
        for(int s:spells){
            int left = 0;
            int right = potions.length-1;
            int pair = 0;
            while(left<=right){
                int mid = left+(right-left)/2;
                if((long)s*potions[mid]<success){
                    left = mid+1;
                }
                else if((long)s*potions[mid]>=success){
                    right = mid-1;
                    pair = Math.max(pair,potions.length-mid);
                }
            }
            pairs[i] = pair;
            i++;
        }
        return pairs;
    }
}
