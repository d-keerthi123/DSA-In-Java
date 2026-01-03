public class QueueUsingArray {
    static class queue{
        static int arr[];
        static int size;
        static int rear;

        queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }

        //isEmpty
        public static boolean isEmpty(){
            return rear==-1;
        }
        //add -O(1)
        public static void add(int data){
            if(rear == size-1){
                System.out.println("queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        //remove - O(n) Because you shift all elements left
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front=arr[0]; // we are storing value of front before removing

            for(int i=0; i<rear;i++){ 
                arr[i]=arr[i+1];
            }
            rear=rear -1; // we removed 1 element;
            return front;
        }

        //peek -O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String[] args) {
        queue q1= new queue(5);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        while (! q1.isEmpty()){
            System.out.print(q1.peek()+ " ");
            q1.remove();
        }

    }
}
