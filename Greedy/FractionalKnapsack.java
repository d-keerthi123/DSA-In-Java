//Tme Complexity O(n log n) - bcz sorting & loops
//Space Complexity O(n) - ratio array

import java.util.Comparator;
import java.util.*;

public class FractionalKnapsack {

    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;

        double ratio[][]=new double[value.length][2];
        //0th column - original index
        //1st column - ratio
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }

        //ascending order but we want ratio to be arranged in descending order , so we run loop in reverse
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        int capacity=W;
        int finalVal=0;
        for(int i=ratio.length -1 ;i>=0;i--){ 
            int idx=(int)ratio[i][0];
            if(capacity >= weight[idx]){
                capacity-=weight[idx];
                finalVal+=value[idx];
            }
            else{
                finalVal+=(ratio[i][1] * capacity);
                capacity=0;
                break;
            }
        }

        System.out.println("Final value :"+finalVal);
    }
}
