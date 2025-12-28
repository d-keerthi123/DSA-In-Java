class LinkedList{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data){
        //step 1 - create new node
        Node newNode=new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail= newNode;
    }
    public void print(){
        //if the ll is empty
        if(head == null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data + "--> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public boolean detectCycle(){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return true; // cycle exits
            }
        }
        return false; // cycle does not exist
    }

}

public class DetectCycle {
    public static void main(String[] args) {
        LinkedList l1= new LinkedList();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.tail.next = l1.head.next; // creates cycle: 5 → 2s

        System.out.println(l1.detectCycle());

        if(!l1.detectCycle()){
            l1.print();
        }else{
            System.out.println("cannot print -- cycle exists");
        }

        
    }

}
