class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        if(str1.length() <= 2 || str2.length() <= 2) {
            if(str1.equals(str2)) return true;
            else return false;
        }
        
        if(str1.length() != str2.length()) return false;
        
        String concatenatedString = str1 + str1;
        
        //check for left shift 
        String leftShiftedString = concatenatedString.substring(2, str1.length() + 2);
        if(leftShiftedString.equals(str2)) return true;
        
        //check for right shift
        String rightShiftedString = concatenatedString.substring(str1.length()-2, str1.length() + str1.length() - 2);
        if(rightShiftedString.equals(str2)) return true;
        
        return false;
    }
    
}
