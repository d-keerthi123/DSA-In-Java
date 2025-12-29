//Time complexity - O(n)
//Space complexity - O(n)


import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str){
         Stack<Character> s = new Stack<>();
         for(int i=0 ; i <str.length() ; i++){
            s.push(str.charAt(i));
         }

         StringBuilder result=new StringBuilder("");
         while(!s.isEmpty()){
            char top=s.pop();
            result.append(top);
         }
         return result.toString();
    }
    public static void main(String[] args) {
        String str="keerthi";
        System.out.println("origibal string :" + str);
        String result= reverseString(str);
        System.out.println("Reversed string : "+result);

    }

}
