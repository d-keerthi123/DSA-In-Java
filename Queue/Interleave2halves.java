//Time Complexity O(n)
// Space Complexity O(n)

import java.util.LinkedList;
import java.util.Queue;

public class Interleave2Halves {
    public static void interleave(Queue<Integer> q){
        Queue<Integer> firstHalf=new LinkedList<>();
        int size=q.size();

        for(int i=0;i<size/2;i++){
            firstHalf.add(q.remove());
        }
        while(! firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }


    }
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        interleave(q);
        //print
        while(! q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
