public class Assignment1 {
    public static void printOcc(int arr[], int key, int i){
        //base case 
        if(i > arr.length-1){
            return;
        }

        if(arr[i]==key){
            System.out.println(i);
        }
         printOcc(arr, key,i+1);

    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        printOcc(arr, key, 0);

    }

}
