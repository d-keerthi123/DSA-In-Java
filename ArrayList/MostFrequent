// Problem: Most Frequent Number following Key (EASY)
// Approach: Collect all numbers immediately after key in an ArrayList,
//           then find the number with the maximum frequency.
// Time Complexity: O(n^2) using ArrayList for counting
// Space Complexity: O(n) for targets list

import java.util.ArrayList;

public class MostFrequent {
    public static int mostFreq(ArrayList<Integer> nums,int key){
         ArrayList<Integer> target=new ArrayList<>(); // ArrayList to keep track of targets that follow key
        //Step 1: Collect all numbers that come immediately after key
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i) == key){
                target.add(nums.get(i+1));
            }
        }
        // Step 2: Find the number with maximum frequency
        int maxcount=0;
        int result=-1;

        for(int i=0;i<target.size();i++){
            int count=0;
            for(int j=0;j<target.size();j++){
                if(target.get(i).equals(target.get(j))){
                    count++;
                }
            }

            if(count> maxcount){
            maxcount=count;
            result=target.get(i);
        }

        }
        return result;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        int key=2;
        System.out.println(mostFreq(nums, key));
        
    }

}
