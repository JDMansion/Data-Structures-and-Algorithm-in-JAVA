class Solution {
    int isPalindrome(String S) {
        
        char S_string[] = S.toCharArray();
        
        for(int i=0; i<S_string.length/2; i++) {
            if(S_string[i] != S_string[S_string.length-1-i]) {
                return 0;
            }
        }
        return 1;
    }
}
