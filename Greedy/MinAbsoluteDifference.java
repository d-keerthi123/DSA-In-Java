//Time Complexity O( n logn ) bcz of loop & sorting
//Space Complexity O(n) due to recursion stack in Arrays.sort(int[])
import java.util.*;
public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int a[]={4,1,8,7};
        int b[]={2,3,5,6};

        Arrays.sort(a); //O( n logn)
        Arrays.sort(b);// O( n logn )

        int minDiff=0;
        for(int i=0;i<a.length;i++){ //O(n)
            minDiff+=Math.abs(a[i]-b[i]);
        }
        System.out.println("Minimum Difference : "+ minDiff);
    }
}
