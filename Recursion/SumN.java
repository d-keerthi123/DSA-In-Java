public class SumN {
    public static int sumOfN(int n){
        if(n==1){
            return 1;
        }
        int sNm1=sumOfN(n-1);
        int sN=n + sNm1;
        return sN;


    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOfN(n));
    }
}
