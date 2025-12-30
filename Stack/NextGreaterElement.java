import java.util.Stack;

public class NextGreaterElement {
    //Brute force - Tc O(n^2)  Sp O(n)- bcs of o/p array
    // public static int[] nextGreaterElement(int arr[]){
    //     int next[]=new int[arr.length];
    //     for(int i=0;i<arr.length;i++){
    //         next[i]=-1; // by default
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[j] > arr[i]){
    //                 next[i]=arr[j];
    //                 break;
    //             }
    //         }
    //     }
    //     return next;
    // }

    //Stack Aprroach Tc & SC -O(n)
    public static int[] nextGreaterElement(int arr[]){
        int n= arr.length;
        int nextGreater[]=new int[n];
        Stack<Integer> s=new Stack<>(); // stores indices

        for(int i= n-1;i>=0 ;i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]= arr[s.peek()]; 
            }
            s.push(i);
        }
        return nextGreater;
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        //print original array
        System.out.print("original array ");
        for(int i=0;i<arr.length;i++){
            System.out.print(+arr[i] + " ");
        }
        System.out.println();

        int result[]=nextGreaterElement(arr);
        //print
        System.out.print("NextGreaterElement array ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
