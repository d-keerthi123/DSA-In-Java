public class FirstOccurence {
    public static int firstOcc(int arr[],int key, int i){
        if(i > arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr,key,i+1);
        
    }

    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,9,3};
        int key=9;
        System.out.println(firstOcc(arr,key,0));

    }
}
