import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(1);
        hs.add(2);
        hs.add(8);
        hs.add(9);
        hs.add(12);
        hs.add(4);


        // System.out.println(hs);
        // System.out.println(hs.contains(2));//true
        // System.out.println(hs.contains(3));//false
        // hs.remove(2);
        // System.out.println(hs);
        // System.out.println(hs.size()); //3
        // hs.clear();
        // System.out.println(hs.isEmpty());//true

        //Iterations on HashSet
        //using interators
        // Iterator it=hs.iterator();
        // while(it.hasNext()){
        //     System.out.print(it.next()+" ");
        // }

        //for loop
        for(Integer i:hs){
            System.out.print(i+" ");
        }
    }
}
