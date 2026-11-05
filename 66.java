class Solution {
    public int[] plusOne(int[] digits) {
        String s = "";
        if(digits[digits.length-1]<9){
            digits[digits.length-1]++;
            return digits;
        } 
        int remainder = 0;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i] = 0;
                remainder = 1;
                continue;
            }
            else if(digits[i]+remainder==10){
                digits[i] = 0;
                continue;
            }
            else if(digits[i]+remainder<10){
                digits[i]++;
                return digits;
            }
            else{
                if(remainder==1){
                    digits[i]++;
                    remainder = 0;
                }
                
            }
        }
        if(remainder==1){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            int k = 1;
            for(int i:digits){
                res[k] = i;
                k++;
            }
            return res;
        }
        return digits;
    }
}
