class Solution {
    String removeDuplicates(String str) {
        str.toLowerCase();
        char[] s = str.toCharArray();
        String ans = "";
        HashMap<Character, Boolean> map = new HashMap<>();
        
        for(int i=0; i<s.length; i++) {
            if(!map.containsKey(s[i])) {
                map.put(s[i], true);
                ans += s[i];
            }
        }
        return ans;
    }
}
