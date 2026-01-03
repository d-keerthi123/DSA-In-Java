public class Assignment2 {
    public static void numToStr(String words[],int num){
        //base case
        if(num==0){
            return;
        }
        numToStr(words,num/10);
        System.out.print(words[num%10] +" ");

    }
    public static void main(String[] args) {
        String words[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int num= 123;
        numToStr(words,num);

    }

}
