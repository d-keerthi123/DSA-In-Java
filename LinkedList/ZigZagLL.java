public class ZigZagLL {
    static class LinkedList{
        static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public  static  Node head; 
    public   static  Node tail;

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

    public void addFirst(int data){
        //step 1 - create new node
        Node newNode=new Node(data);
        
        if(head == null){
            head=tail=newNode;
            return;
        }
        // step 2 - newNode next= head
        newNode.next = head; //link

        // step 3 - head = newNode
        head= newNode;
    }


    public static Node getMid(Node head){
        Node slow=head;
        Node fast=head;
        while( fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; // slow is the mid
    }
    public static void zigZagLL(){

        // reverse 2nd half
        Node prev= null;
        Node midNode=getMid(head);
        Node curr=midNode;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev; // right head
        Node left=head;
        Node nextL,nextR;

        while(left != null && right != null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            right=nextR;
            left=nextL;
        }
        
    }

    }
    public static void main(String[] args) {
        LinkedList l1= new LinkedList();
        l1.addFirst(5);
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.print();
        l1.zigZagLL(); 
        l1.print();   
    }
}

