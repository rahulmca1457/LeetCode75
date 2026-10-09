class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int left = 0;
        int right = 0;
        while(left<word1.length() || right<word2.length()){
            if(left<word1.length()){
                res = res+String.valueOf(word1.charAt(left));
                left++;
            }
            if(right<word2.length()){
                res = res+String.valueOf(word2.charAt(right));
                right++;
            }
        }
        return res;
    }
}
