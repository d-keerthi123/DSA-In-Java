import java.util.PriorityQueue;
//to implement priority in classes we need to define Comparable interface to compare objects of Student class
    class Student implements Comparable<Student> {
        String name;
        int rank;
        public Student(String name, int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }

    }

public class PriorityQueueObj {
    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>();
        
        pq.add(new Student("A",2)); //O(log n)
        pq.add(new Student("B",5));
        pq.add(new Student("C",3));
        pq.add(new Student("D",1));
        pq.add(new Student("E",4));

        while(! pq.isEmpty()){
            System.out.println(pq.peek().name + "->"+ pq.peek().rank); //O(1)
            pq.remove(); //O(log n)
        }
    }
}
