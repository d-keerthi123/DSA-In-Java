public class xPowerN{
    public static int xPn(int x,int n){
        //base case 
        if(n==1){
            return x;
        }
        int xNm1=xPn(x,n-1);
        int xN=x * xNm1;
        return xN;

    }
    public static void main(String[] args) {
        int n;
        int x;
        System.out.println(xPn(2,6));
    }

    
}
