public class DiameterOfTree {
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
        public static int height(Node root){
        //base case
        if(root == null){
            return 0;
        }
        int lh=height(root.left); //left height
        int rh=height(root.right); //right height
        int maxHeight=Math.max(lh,rh)+1;

        return maxHeight;
    }
    //Approach 1
    //diameter() → O(n) height() → O(n)
    //Height was recomputed again and again .Repeated work = O(n²)

    // public static int diameter(Node root){ //O(n^2)  --> n x O(n) diameter() calls height at every node
    //     //base case
    //     if(root == null){
    //         return 0;
    //     }
    //     int leftdiameter=diameter(root.left);
    //     int righttdiameter=diameter(root.right);

    //     int leftHeight=height(root.left);
    //     int rightHeight=height(root.right);
    //     int selfDiamter=leftHeight+rightHeight+1;

    //     return Math.max(selfDiamter,Math.max(leftdiameter,righttdiameter));


    // }

    //Approach 2 O(n)
    //Do not calculate height separately.Return both height and diameter together from every node.
    static class info{
        int diameter;
        int height;

        info(int diameter,int height){
            this.diameter=diameter;
            this.height=height;
        }
    }
    public static info diameter(Node root){

        if(root == null){
            return new info(0,0) ;
        }
        info leftInfo=diameter(root.left); //calculates height & diameter of left subtree
        info rightInfo=diameter(root.right);// //calculates height & diameter of right subtree

        int diameter=Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height+rightInfo.height+1);
        int height=Math.max(leftInfo.height,rightInfo.height)+1;

        return new info(diameter, height);
    }


    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        // System.out.println("Diameter of Tree :"+ diameter(root));
        System.out.println("Diameter of Tree :" + diameter(root).diameter);
    }


}
