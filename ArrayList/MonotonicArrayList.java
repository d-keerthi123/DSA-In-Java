// Problem: Check if an ArrayList is monotonic
// Learned: When using i+1, loop must run till size-1
// Time Complexity: O(n)
// Space Complexity: O(1)


import java.util.ArrayList;

public class MonotonicArrayList {
    public static boolean monotonicOrNot(ArrayList<Integer> nums){
        boolean inc=true;
        boolean dec=true;

        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)> nums.get(i+1)){
                inc=false;
            }
            if(nums.get(i)> nums.get(i+1)){
                dec=false;
            }

        }
        return inc ||dec;


    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(3);
        System.out.println(monotonicOrNot(nums));

    }

}




