class Solution{
    String rremove(String s) {
        
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        char lastChar = 0;
        
        for(int i=0; i<n; i++) {
            boolean repeated = false;
            while(i+1 < n && s.charAt(i) == s.charAt(i+1)) {
                i++;
                repeated = true;
            }
            
            if(!repeated) {
                sb.append(s.charAt(i));
            }
        }
        
        if(s.length() == sb.length()) {
            return sb.toString();
        } else {
            return rremove(sb.toString());
        }
    }
}
