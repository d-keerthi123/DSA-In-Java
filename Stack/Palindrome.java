//Time Complexity O(n) & Space Complexity O(n)

import java.util.LinkedList;
import java.util.Stack;

public class Palindrome {
    public static boolean palindrome(LinkedList<Integer> l1){
        Stack<Integer> s=new Stack<>();
        //push elements
        for(int i=0;i<l1.size();i++){
            s.push(l1.get(i));
        }

        // pop elements from list & compare
        for(int i=0;i<l1.size();i++){
            if(!l1.get(i).equals(s.pop())){
                return false; // Not palindrome
            }
        }
        return true; //  palindrome

    }
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(1);
        System.out.println(l1);
        System.out.println(palindrome(l1));

    }
}
