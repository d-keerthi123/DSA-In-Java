public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data){
        //create new node
        Node newNode=new Node(data);
        size++;

        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    //print
    public void print(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+ " <-> ");
            temp=temp.next;
        }
        System.out.println("null");

    }
    //addLast
    public void addLast(int data){

        Node newNode=new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
    }

    //remove first
    public int removeFirst(){
        if(head==null){
            System.out.println("its empty !!");
            return Integer.MIN_VALUE;
        }
        if(size ==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data; 
        head=head.next;
        head.prev=null;
        size--;
        return val; 
    }

    //remove last
    public int removeLast(){
        if(head==null){
            System.out.println("its empty !!");
            return Integer.MIN_VALUE;
        }
        if(size ==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        
        int val=tail.data; 
        tail=tail.prev; // make prev node as tail
        tail.next=null;  
        size--;
        return val;
    }

    

    //reverse
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        // dll.removeFirst();
        // dll.print();
        // dll.removeLast();
        // dll.print();
        // dll.addLast(4);
        // dll.print();

        dll.reverse();
        dll.print();
        
    }

}
