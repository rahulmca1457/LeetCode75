class Solution {
    public String reverseWords(String s) {
        String[] strarr = s.split("\\s+");
        String result = "";
        for(int i=strarr.length-1; i>=0; i--){
            result += strarr[i];
            if(i!=0){
                result += " ";
            }
        }
        if(result.charAt(result.length()-1)==' '){
            result = result.substring(0,result.length()-1);
        }
        return result;
    }
}
