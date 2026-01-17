public class CountOfNodes {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int count(Node root){
        //base case
        if(root == null){
            return 0;
        }
        int lc=count(root.left); //left count
        int rc=count(root.right); //right count
        int treeCount= lc+rc+1;

        return treeCount;

    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println("Count of nodes :"+count(root));
    }

}
