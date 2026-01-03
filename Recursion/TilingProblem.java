public class TilingProblem {
    public static int noOfways(int n){
        if(n==0 || n==1){
            return 1;
        }
        int vertical =noOfways(n-1);
        int horizontal=noOfways(n-2);
        int totalWays= vertical + horizontal;
        return totalWays;
    }
    public static void main(String[] args) {
        int n;
        System.out.println(noOfways(5));
    }

}
