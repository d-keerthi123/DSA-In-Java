//Time Complexity O(n)
//Space Complexity O(n)


import java.util.Stack;

public class ValidParantheses {
    public static boolean validParantheses(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' ||ch=='{'||ch=='['){
                s.push(ch);
            }
           else{
            if(s.isEmpty()){
            return false;
           }
            if(ch==')' && s.peek()=='('){
                s.pop();
            }
            else if(ch=='}' && s.peek()=='{') {
                s.pop();
            }
            else if(ch==']' && s.peek()=='['){
                s.pop();
            }
            else{
                return false;
            }
            }

           }
           if(s.isEmpty()){
            return true;
           }
           return false;
           }
    public static void main(String[] args) {
        String str="({[]})";
        System.out.println(validParantheses(str));
    }
}
