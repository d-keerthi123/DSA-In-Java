public class Assignment5 {
    public static void towerOfHanaoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfered disk " + n + "  from  "+ src+ "  to  "+ dest);
            return;
        }
        towerOfHanaoi(n-1, src, dest, helper);
        System.out.println("transfered disk " + n + "  from  "+ src+ "  to  "+ dest);
        towerOfHanaoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n=2;
        towerOfHanaoi(n, "S","H","D");
    }

}
