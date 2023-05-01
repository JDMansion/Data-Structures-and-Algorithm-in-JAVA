class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        int n = x.length();
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<n; i++) {
            char ch = x.charAt(i);
            if(ch == ')') {
                if(st.size()==0 || st.peek()!='(') return false;
                st.pop();
            }
            else if(ch == '}') {
                if(st.size()==0 || st.peek()!='{') return false;
                st.pop();
            }
            else if(ch == ']') {
                if(st.size()==0 || st.peek()!='[') return false;
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        return st.size() == 0;
    }
}
