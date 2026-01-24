public class DeleteNode {
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
     public static Node insert(Node root,int val){
        if(root == null){
            root= new Node(val);
            return root;
        }
        if(root.data > val){
            root.left=insert(root.left, val);
        }
        if(root.data < val){
            root.right=insert(root.right, val);
        }
        return root;
    }
    //inorder traversal
    public static void inorder(Node root){
        //base case
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    
    public static Node delete(Node root,int val){
        //base case
        if(root ==null){
            return null;
        }
        if(root.data < val){ //right subtree
            root.right=delete(root.right, val); 
        }
        else if(root.data >val){
            root.left=delete(root.left, val);
        }
        else{
            // case 1: No child
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2: one child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            
            //case 3: two children
            Node IS=findInOrderSuccessor(root.right);
            root.data=IS.data; //replace value with inorder successor
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node findInOrderSuccessor(Node root){
        while(root.left != null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
             root=insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        
        
        if(searchBST(root,15)){
            delete(root, 15);
        }
        inorder(root);
    }
}
