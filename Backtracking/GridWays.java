public class GridWays {
    // public static int gridWays(int i,int j,int n,int m){
    //     //base case
    //     if(i == n-1 && j==m-1){ //last cell condition
    //         return 1;
    //     }
    //     if(i == n || j==m){ // out of boundary condition
    //         return 0;
    //     }

    //     //recursion
    //     int down=gridWays(i+1, j, n, m);
    //     int right=gridWays(i, j+1, n, m);
    //     return down+right;

    // }
    // public static void main(String[] args) {
    //     int n=3,m=3;
    //     System.out.println("total ways "+gridWays(0, 0, n, m));
    // }
    public static int factorial(int n){
        int fact=1;
        for(int i=1 ;i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    public static int gridWays(int n,int m){
        int totalSteps= n+m-2;
        int downMoves=n-1;
        int rightMoves=m-1;
        return factorial(totalSteps)/(factorial(downMoves)*factorial(rightMoves));

    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println("total ways "+ gridWays(n, m));
    }

}
