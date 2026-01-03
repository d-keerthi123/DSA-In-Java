public class Assignment3 {
    public static int strLength(String str){
        //base case
        if(str.length()==0){
            return 0;
        }
        return 1 + strLength(str.substring(1));
       
    }
    public static void main(String[] args) {
        String str= "keerthi";
        System.out.println(strLength(str));

    }

}
