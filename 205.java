class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))&&map.get(s.charAt(i))==t.charAt(i)){
                          continue;
            }
            else if(!map.containsKey(s.charAt(i))&&!set.contains(t.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
                set.add(t.charAt(i));
            }
            else{
                return false;
            }
        }
        return true;
    }
}
