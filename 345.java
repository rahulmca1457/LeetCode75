class Solution {
    public String reverseVowels(String s) {
        if(s.equals(" ")){
            return " ";
        }
        int left = 0;
        int right = s.length()-1;
        char[] c = s.toCharArray();
        while(left<right){
            while(left<right && !isrev(c[left])){
                left++;
            }
            while(left<right && !isrev(c[right])){
                right--;
            }
            if(left<=right){
                char a = c[left];
                c[left] = c[right];
                c[right] = a;
                left++;
                right--;
            }
        }
        return String.valueOf(c);
    }
    public boolean isrev(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
}
