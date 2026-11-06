class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] arr = s.split(" ");
        Set<String> set = new HashSet<>();
        if(arr.length!=pattern.length()) return false;
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i)) && 
            (map.get(pattern.charAt(i)).equals(arr[i]))){
                continue;
            }
            else if(!map.containsKey(pattern.charAt(i)) && !set.contains(arr[i]) ){
                map.put(pattern.charAt(i),arr[i]);
                set.add(arr[i]);
            }
            else return false;
        }
        return true;
    }
}
