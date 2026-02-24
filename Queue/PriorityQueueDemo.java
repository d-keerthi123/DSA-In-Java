import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq=new PriorityQueue<>(); //ascending order
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); //descending  order
        pq.add(6); //O(log n)
        pq.add(1);
        pq.add(8);
        pq.add(3);
        pq.add(2);

        while(! pq.isEmpty()){
            System.out.println(pq.peek()); //O(1)
            pq.remove(); //O(log n)
        }
    }
}
