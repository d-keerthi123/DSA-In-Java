//Time complexity - O(n)
//Space complexity - O(1)

public class SwapNodes {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public  static  Node head;
        public  static  Node tail;

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
    public static Node swapNodes(Node head,int x,int y){
        Node curr=head;
        Node nodeX=null;
        Node nodeY=null;

        while(curr != null){
            if(curr.data == x){
                nodeX=curr;
            }
            if(curr.data == y){
                nodeY=curr;
            }
            curr=curr.next;
        }
        if( nodeX==null || nodeY==null){
            System.out.println("one or both elements not found");
        }
        int temp=nodeX.data;
        nodeX.data=nodeY.data;
        nodeY.data=temp;

        return head;
        
    }
    public static void main(String[] args) {
        SwapNodes l1= new SwapNodes();
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        
        l1.print();
        l1.swapNodes(head,2,4);
        l1.print();

        
    }
}
