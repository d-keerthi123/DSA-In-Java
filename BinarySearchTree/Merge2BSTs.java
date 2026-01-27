//Time Complexity - linear O(n)  if n>m , O(n+m)

import java.util.ArrayList;

public class Merge2BSTs {
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
    //Inorder seq
    public static void inorder(Node root,ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
    public static Node createBST(ArrayList<Integer> arr,int start,int end){
        //base case
        if(start>end){
            return null;
        }
        //find mid
        int mid=(start+end)/2;
        Node root=new Node(arr.get(mid));

        root.left=createBST(arr, start, mid-1);
        root.right=createBST(arr, mid+1, end);

        return root;


    }
    public static Node mergeBST(Node root1,Node root2){
        //Get inorder seq of bst1
        ArrayList<Integer> arr1=new ArrayList<>();
        inorder(root1,arr1);

        //Get inorder seq of bst2
        ArrayList<Integer> arr2=new ArrayList<>();
        inorder(root2,arr2);

        //Merge both sorted array lists
        int i=0,j=0;
        ArrayList<Integer> finalArr= new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }
            else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        //to add remaining elements
        while(i< arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }
         while(j< arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }


        //sorted array list--> balanced bst
        return createBST(finalArr, 0, finalArr.size()-1);
    }
    public static void preorder(Node root){ //root -left-right
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void main(String[] args) {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);

        Node root=mergeBST(root1,root2);
        preorder(root);


    }
}
