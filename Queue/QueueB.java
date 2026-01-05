import java.util.LinkedList;
import java.util.Queue;
// since queue is an interface we cannot craete objects for it .So we make class using LinkedList or ArrayDeque
//ArrayDeque is preferred over LinkedList for queue/stack because it is faster and more memory-efficient
// use LinkedList When you also need List operations

public class QueueB {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>(); // or we can use ArrayDeque too
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
