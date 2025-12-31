//Time Complexity O(n)
//Space Complexity O(n)

import java.util.Stack;

public class DuplicteParentheses {
    public static boolean duplicteParentheses(String str){

        Stack<Character> s= new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            //closing
            if(ch ==')'){
                int count=0;
                while( !s.isEmpty() && s.peek()!='('){
                    s.pop();
                    count++;
                }

                if(count<1){ // duplicate condition
                    return true;
                }
                else{
                    s.pop(); // opening parentheses
                }
        }
        else{
            s.push(ch);
        }


        }

        return false;
    }

    public static void main(String[] args) {
        String str="((a+b))";
        System.out.println(duplicteParentheses(str));
    }
}
