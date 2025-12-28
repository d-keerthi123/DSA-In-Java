// Generates a Beautiful Array of size n
// where no element is the average of two others in index order.
// Approach: Iteratively build the array by placing odd numbers first, then even numbers,
// ensuring the "beautiful" property is preserved at each step.
//
// Time Complexity: O(n) — Each number 1..n is generated exactly once per iteration.
// Space Complexity: O(n) — Uses additional ArrayList 'temp' to store intermediate arrays.


import java.util.ArrayList;

public class BeautifulArraylist {
    public static ArrayList<Integer> beautifulOrNot(int n){
        ArrayList<Integer> result=new ArrayList<>();
        result.add(1);

        while(result.size() <n){
            ArrayList<Integer> temp=new ArrayList<>();
            //odd
            for(int i=0;i<result.size();i++){
                int x = result.get(i);
                int odd=2*x-1;
                if(odd<=n){
                    temp.add(odd);
                }
            }
            //even
            for(int i=0;i<result.size();i++){
                int x = result.get(i);
                int even=2*x;
                if(even<=n){
                    temp.add(even);
                }
            }
            result=temp;

        }
        return result;

    }
    public static void main(String[] args) {
        
        int n=5;
        System.out.println(beautifulOrNot(n));
        
    }

}
