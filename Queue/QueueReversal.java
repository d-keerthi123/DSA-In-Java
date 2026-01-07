//Time Complexity O(n)
//Space Complexity O(n)

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {

    public static void queueReverse(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        // Move queue → stack
        while(! q.isEmpty()){
            s.push(q.remove());
        }
        //Move stack → queue (reversed)
        while(! s.isEmpty()){
            q.add(s.pop());
        }
        
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        queueReverse(q);
        while(! q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
