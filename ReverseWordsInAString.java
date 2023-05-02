class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String words[] = S.split("\\.");
        
        for(int i=0; i<words.length/2; i++) {
            String temp = words[i];
            words[i] = words[words.length-1-i];
            words[words.length-1-i] = temp;
        }
        return String.join(".",words);
    }
}
