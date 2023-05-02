class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        char a_string[] = a.toCharArray();
        char b_string[] = b.toCharArray();
        
        Arrays.sort(a_string);
        Arrays.sort(b_string);
        
        if(a_string.length != b_string.length) {
            return false;
        }
        
        
        for(int i=0; i<a_string.length; i++) {
            if(a_string[i] != b_string[i]) return false;
        }
        return true;
    }
}
