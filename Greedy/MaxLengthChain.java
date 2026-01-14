//Time Complexity O(n logn)
//Space Compplexity O(n)

import java.util.Comparator;
import java.util.*;
public class MaxLengthChain {
    public static void main(String[] args) {

        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1])); //O(n log n)

        int chainLen=1;
        int lastPairEnd=pairs[0][1];
        for(int i=1;i<pairs.length;i++){ //O(n)
            if(pairs[i][0] > lastPairEnd){ //if  no overlapping - select pair
                chainLen++;
                lastPairEnd=pairs[i][1];
            }
        }

        System.out.println("Maximum cahin length :"+ chainLen);
    }
}
