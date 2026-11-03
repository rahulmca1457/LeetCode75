class Solution {
    public int reverse(int x) {
        
        int dup = 0;
        if(x>=0)
        dup = x;
        else
        dup = -x;
        double rev = 0;
        while(dup>0){
            rev = (rev*10)+(dup%10);
            dup = dup/10;
        }
        if(rev>Integer.MAX_VALUE) return 0;
        else 
        if(x<0){
            return (int)(-(rev)); 
        }
        else return (int)((rev));
    }
}
