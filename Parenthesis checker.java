class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                else{
                    boolean c1=ch=='}' && s.peek()=='{';
                    boolean c2=ch==']' && s.peek()=='[';
                    boolean c3=ch==')' && s.peek()=='(';
                    if(c1||c2||c3){
                        s.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
