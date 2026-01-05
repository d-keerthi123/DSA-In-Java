public class CircularQueueUsingArray {
    static class circularQueue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        circularQueue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        //add O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            //to add 1st element
            if(front ==-1){
                front=(front+1) % size;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //remove O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result= arr[0];
            // if we are deleting last element
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        circularQueue q=new circularQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while( ! q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
