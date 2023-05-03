class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        String ans = "";
        
        for(int i=str.length()-1; i>=0; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }
}
