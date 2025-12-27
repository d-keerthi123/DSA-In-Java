//Time complexity - O(n)
//Space complexity - O(1)

public class EvenOddLL {
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
    public static void evenOddLL(){
        Node curr=head;
        Node evenH=null;
        Node evenT=null;

        Node oddH=null;
        Node oddT=null;


        while(curr != null){
            if(curr.data % 2 == 0) { // even 
                if(evenH==null){
                    evenH=evenT=curr;
                }
                else{
                    evenT.next=curr; // tail.next = curr
                    evenT=curr; // curr becomes tail
                }
            }
            else{
                if(oddH==null){
                    oddH=oddT=curr;
                }
                else{
                    oddT.next=curr;
                    oddT=curr;
                }
                
            }
            curr=curr.next;
           
        }
         // combine even and odd lists
            if(evenT != null){ //if even elements exits
                evenT.next=oddH;
            }
            if(oddT != null){
                oddT.next=null;  
                head=evenH; 
            }
            else{
                head=oddH; //no even elements
            }
        

    }
    public static void main(String[] args) {
        EvenOddLL l1=new EvenOddLL();
        l1.addFirst(6);
        l1.addFirst(1);
        l1.addFirst(4);
        l1.addFirst(5);
        l1.addFirst(10);
        l1.addFirst(12);
        l1.addFirst(8);
        l1.print();
        l1.evenOddLL();
        l1.print();



        
    }

}
