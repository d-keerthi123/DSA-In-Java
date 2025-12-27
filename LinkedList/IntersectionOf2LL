// Time Complexity - O(m*n)
//Space Complexity - O(1)

public class IntersectionOf2LL {
    
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public  Node head;  
    public  Node tail;
    public static Node getIntersectionNode(Node head1, Node head2){

        while(head2 != null){
            Node temp=head1;
            while(temp != null){
                if(temp == head2){
                    return head2;
                }
                temp=temp.next;
            }
            head2=head2.next;
        }
        return null;
    }
    
    public static void main(String[] args) {
        IntersectionOf2LL l1=new IntersectionOf2LL();
        Node common1= new Node(6);
        Node common2= new Node(7);
        common1.next=common2;

        Node head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node(3);
        head1.next.next.next=common1;

        Node head2=new Node(4);
        head2.next=new Node(5);
        head2.next.next=common1;
        
        Node intersectionPoint = getIntersectionNode(head1,head2);
        if(intersectionPoint == null ){
            System.out.println("no interection point");
        }else{
            System.out.println("intersection point is :"+ intersectionPoint.data);
        }
         
    }

}
