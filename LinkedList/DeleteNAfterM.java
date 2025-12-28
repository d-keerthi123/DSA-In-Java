public class DeleteNAfterM {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static  Node head;  
    public static Node tail;
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

    public static Node skipMDeleteN(Node head,int m, int n){
        Node curr=head;
            //skip m  nodes
            while(curr !=null){
                for(int count=1;count<m && curr != null ;count++){
                curr=curr.next;
            }
            if(curr == null){
                break;
            }
            // delete n nodes 
            Node temp=curr.next;
            for(int count=1;count<=n && temp!= null;count++ ){
                temp=temp.next;
            }
            curr.next=temp; // link skipped part to remaining list
            curr=temp; // move forward
            }
            return head;
    }

    public static void main(String[] args) {
        int m=3;
        int n=2;
        DeleteNAfterM l1= new DeleteNAfterM();
        l1.addFirst(8);
        l1.addFirst(7);
        l1.addFirst(6);
        l1.addFirst(5);
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.print();
        l1.skipMDeleteN(head,m, n);
        l1.print();

    }

}
