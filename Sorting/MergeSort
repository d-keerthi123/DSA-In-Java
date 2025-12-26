//Time complexity-O(nlogn)
//Space complexity- O(n) (because of the temporary array)

public class MergeSort {
    public static void printArr(int arr[]){
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si, int ei){
        //base case
        if(si >= ei){
            return;
        }
        int mid=si+(ei-si)/2; // mid index
        mergeSort(arr,si,mid); // left part
        mergeSort(arr,mid+1,ei);//right part

        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[], int si,int mid,int ei){
        // (0,6)array size is 7 not 6 so add 1 to ei-si
        int temp[]= new int[ei-si+1];
        int i=si;//left iterator
        int j=mid+1; // right iterator
        int k=0; // temporary array interator

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j] ){
                temp[k++] = arr[i++];
                
            }else{
                temp[k++] = arr[j++];
                
            }
            
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }


    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);

    }

}
