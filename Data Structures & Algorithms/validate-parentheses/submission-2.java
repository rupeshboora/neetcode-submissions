class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        char[] arr=s.toCharArray();
        for(char ch:arr){
            if(ch==')')
            {
                if(!st.isEmpty() && st.peekFirst()=='(')
                st.pop();
                else
                return false;
            }
            else if(ch=='}')
            {
                if(!st.isEmpty() && st.peekFirst()=='{')
                {
                    st.pop();
                    continue;
                }
                else
                return false;
            }
            else if(ch==']')
            {
                if(!st.isEmpty() && st.peekFirst()=='[')
                st.pop();
                else
                return false;
            }
            else if(ch=='{' || ch=='(' || ch=='[')
            st.push(ch);
        }
        if(st.isEmpty())
        return true;
        else
        return false;
    }
}
