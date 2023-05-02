class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int ans = 0;
        
        for(int i=0; i<str.length()-1; i++) {
            if(map.get(str.charAt(i)) < map.get(str.charAt(i+1))) {
                ans -= map.get(str.charAt(i));
            }
            else {
                ans += map.get(str.charAt(i));
            }
        }
        
        ans += map.get(str.charAt(str.length()-1));
        return ans;
    }
}
