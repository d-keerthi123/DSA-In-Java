//Time complexity O(n)
//Space Complexity 

import java.util.Stack;

public class MaxAreaHistogram {
    
    public static int maxArea(int heights[]){
        int n=heights.length;
        //Next Smaller Right
        Stack<Integer> s= new Stack<>(); // stores indices
        int nsr[]=new int[n];
        
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

            //Next Smaller left
            s= new Stack<>(); // stores indices

            int nsl[]=new int[n];
            for(int i=0;i<n;i++){
                while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                    s.pop();
            }


            if(s.isEmpty()){
                nsl[i]=n;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //Area
        int MaxArea=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            int area= heights[i] * (nsr[i]-nsl[i]-1);
            if(area >MaxArea ){
                MaxArea=area;
            }
        }
        return MaxArea;
    }
    public static void main(String[] args) {
        int heights[]={2,1,5,6,2,3};
        System.out.println("Maximum Area :" + maxArea(heights));
    }
}
