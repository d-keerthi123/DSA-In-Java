// Problem: Lonely Numbers in ArrayList (MEDIUM)
// Approach: Sort ArrayList and check adjacent elements
// Time Complexity: O(n log n)
// Space Complexity: O(n) for output list

import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumbers {
    public static ArrayList<Integer> findLonelyNums(ArrayList<Integer> nums){
         Collections.sort(nums); //sorted arraylist
         ArrayList<Integer> lonelyNums=new ArrayList<>();
         

         for(int i=0;i<nums.size();i++){
            boolean left=true;
            boolean right=true;
            //left
            if(i>0){
                if(nums.get(i) == nums.get(i-1) || nums.get(i) - nums.get(i-1) == 1){
                    left=false;
                } // no duplicate & diff 1 --- not lonely
            }
            //right
            if(i < nums.size()-1){
                if(nums.get(i) == nums.get(i+1) || nums.get(i+1) - nums.get(i)== 1){
                    right=false;
                } // no duplicate & diff 1 --- not lonely
            }

            if(left && right){
                lonelyNums.add(nums.get(i));
         }

         }
         return lonelyNums;
    }


    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        
        
        nums.add(10);
        nums.add(10);
        nums.add(5);
        nums.add(6);
        System.out.println(findLonelyNums(nums));
    }

}

