public class LastOccurence {
    public static int lastOcc(int arr[], int key, int i){
        //base case 
        if(i > arr.length-1){
            return -1; //   NOT FOUND
        }
        int isfound=lastOcc(arr,key,i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
        
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,9,3};
        int key=9;
        System.out.println(lastOcc(arr,key,0));
    }

}
