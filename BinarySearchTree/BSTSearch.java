//Time Complexity O(H)- H is the height of the tree

public class BSTSearch {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean searchBST(Node root,int key){
        //base case
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data >key){
           return searchBST(root.left, key);
        }
        else{
            return searchBST(root.right, key);
        }
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        
        System.out.println(searchBST(root, 6));
    }
}
