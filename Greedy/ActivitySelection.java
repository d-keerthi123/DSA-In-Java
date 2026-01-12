//Time Complexity O(n) (since activities are already sorted by end time) Otherwise O(n log n) including sorting
//Space Complexity O(n) due to ArrayList used to store selected activities

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9}; //end time basis sorted

        int maxAct=0;
        ArrayList<Integer> ans= new ArrayList<>();

        // //1st actvity
        // maxAct=1;
        // ans.add(0);
        // int lastEnd=end[0];
        // for(int i=1;i<end.length;i++){
        //     if(start[i]>= lastEnd){ // no overlapping- activity selected
        //         maxAct++;
        //         ans.add(i);
        //         lastEnd=end[i];
        //     }
        // }

        //Sorting -if end time not sorted
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];

        }
        //lamda function -> shortform
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2])); // sorting based on column 2 (end time)

        //1st actvity
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>= lastEnd){ // no overlapping- activity selected
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }


        System.out.println("Maximum Activities :"+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ ans.get(i)+ " ");
        }
    }
}
