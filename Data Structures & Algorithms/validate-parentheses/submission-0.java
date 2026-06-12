class Solution {
    public boolean isValid(String s) {

        char[] str = s.toCharArray();

        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length; i++) {

            if(str[i] == '(' || str[i] == '[' || str[i] == '{') {
                st.push(str[i]);
            } else {
                if(str[i] == ')') {
                    if(st.isEmpty() == true || st.peek() != '(') {
                        return false;
                    } else {
                        st.pop();
                    }
                }

                if(str[i] == ']') {
                    if(st.isEmpty() == true || st.peek() != '[') {
                        return false;
                    } else {
                        st.pop();
                    }
                }

                if(str[i] == '}') {
                    if(st.isEmpty() == true || st.peek() != '{') {
                        return false;
                    } else {
                        st.pop();
                    }
                }

            }
        }

        if(st.isEmpty()) {
            return true;
        }

        return false;



        
    }
}
