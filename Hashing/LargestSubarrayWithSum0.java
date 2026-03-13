import java.util.HashMap;

public class LargestSubarrayWithSum0 {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        int k=0;

        //Brute Force - O(n^2)
        // int maxLen=Integer.MIN_VALUE;

        // for(int i=0;i<arr.length;i++){
        //     int sum=0;
        //     for(int j=i;j<arr.length;j++){
        //         sum+=arr[j];

        //         if(sum ==0){
        //             int len=j-i+1;
        //             maxLen=Math.max(len,maxLen);
        //         }
        //     }
        // }
        // System.out.println("length of largest subarray with sum 0 is :"+ maxLen);

        //HashMap approach O(n)

        HashMap<Integer,Integer> map=new HashMap<>(); //sum,index

        int sum=0;
        int len=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum)){
                len=Math.max(len,j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
        System.out.println("length of largest subarray with sum 0 is :"+ len);
    }
}
