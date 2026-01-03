public class Assignment4 {
    public static int  count(String str, int si,int ei){
        //si starting index of substring (fixed)
        //ei ending index of substring (moves forward)
        int n= str.length();
        if( ei == n){
            return 0; // no more endings 
        }
        int add= str.charAt(si)== str.charAt(ei)?1:0; 
        return add+ count(str, si,ei+1);
    }
    public static int total(String str, int si){
        int n= str.length();
        if( si == n){
            return 0; // no more starts
        }
        return count(str,si,si) +total(str, si+1);
    }
    public static void main(String[] args) {
        String str="abb";
        System.out.println(total(str,0));
    }

}
