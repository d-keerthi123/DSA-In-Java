public class xPowerNOptimized {
    public static int xPnO(int x, int n){
        if(n==0){
            return 1;  //base case 
        }
        // we might think its optimized but its not stiil we are having time complexity as O(n) only 
        // bcz we are calling the same func twice so  better we will create a variable for it 
        // n even
        // int halfPowerSq=xPnO(x,n/2) * xPnO(x,n/2);
        // if(n%2 != 0){
        //      int xPn= x*halfPowerSq;
        //     return xPn;
            
        // }
        
        // return halfPowerSq;

        int halfPower = xPnO(x,n/2);
        int halfPowerSq= halfPower * halfPower;
        if(n%2 != 0){
            int xPn= x*halfPowerSq;
            return xPn;
        }
        return halfPowerSq;

        
    }
    public static void main(String[] args) {
        int n=10;
        int x=2;
        System.out.println(xPnO(x,n));

    }

}
