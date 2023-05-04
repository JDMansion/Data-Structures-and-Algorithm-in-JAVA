class Solution {

    public boolean isValid(String s) {
        
        if(s.charAt(s.length()-1) == '.') return false;
        
        String[] num = s.split("\\.");
        
        if(num.length != 4) return false;
        
        for(String st:num) {
            if(st.isEmpty()) return false;
            
            if(Character.isLetter(st.charAt(0))) return false;
            
            int a = Integer.parseInt(st);
            if(a == 0 && st.length() > 1 && st.charAt(1) == '0') return false;
            if(a > 0 && a <= 255 && st.charAt(0) == '0') return false;
            if(!(a >= 0 && a <= 255)) return false;
        }
        return true;
    }
}
