class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch =='(' || ch =='[' || ch == '{' ){
                st.push(ch);
            }else if(ch == ')'){
                boolean val= handleclosing(st, '(');
                if(val == false){
                    return false;
                }

            }else if(ch == ']'){
                boolean val = handleclosing(st, '[');
                if(val == false){
                    return false;
                }


            }else if(ch == '}'){
                boolean val = handleclosing(st, '{');
                if(val == false){
                    return false;
                }

            }
        }
        if(st.size() == 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean handleclosing(Stack<Character> st, char bracket){
            if(st.size()==0){
                return false;
            } else if(st.peek() != bracket){
                return false;
            }else{
                st.pop();
                return true;
            }
    }

}

