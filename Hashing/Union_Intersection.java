import java.util.HashSet;

public class Union_Intersection {
    public static void main(String[] args) {
        int nums1[]={7,3,9};
        int nums2[]={6,3,9,2,9,4};
        HashSet<Integer> hs= new HashSet<>();
        //union
        for(Integer n1: nums1){
            hs.add(n1);
        }
        for(Integer n2: nums2){
            hs.add(n2);
        }
        System.out.println("union ( size) :" + hs.size());

        //Intersection
        HashSet<Integer> hs2= new HashSet<>();
        

        // brute force
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==(nums2[j])){
        //             hs2.add(nums1[i]);
        //         }
        //     }
        // }

        for(Integer n1: nums1){
            hs2.add(n1);
        }
        int count=0;
        for(int i=0;i<nums2.length;i++){
            if(hs2.contains(nums2[i])){
                count++;
                hs2.remove(nums2[i]);
            }
        }
        System.out.println("Intersection (size): "+count);
    }
}
