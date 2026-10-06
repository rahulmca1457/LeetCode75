class Solution {
    public String longestPalindrome(String s) {
        int count = 0;
        String res = "";
        int left = 0;
        int right = 0;
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            left = i; right = i; start = 0; end = 0;    
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1>count){
                    count = right-left+1;
                    res = s.substring(left,right+1);
                }
                left--; right++;
            }
        }

        for(int i=0;i<s.length();i++){
            left = i; right = i+1; start = 0; end = 0;    
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1>count){
                    count = right-left+1;
                    res = s.substring(left,right+1);
                }
                left--; right++;
            }
        }

        return res;
    }
}
