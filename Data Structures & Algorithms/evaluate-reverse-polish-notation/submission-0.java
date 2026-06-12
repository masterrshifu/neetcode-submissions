class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for(String str: tokens) {
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                int a = st.pop();
                int b = st.pop();
                st.push(calc(b,a, str));
            } else {
                st.push(Integer.parseInt(str));
            }
        }

        return st.peek();
        
    }


    public int calc(int a, int b, String op) {

        if(op.equals("+")) return a+b;
        if(op.equals("-")) return a-b;
        if(op.equals("*")) return a*b;
        return a/b;
    }
}
