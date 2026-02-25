import java.util.ArrayList;

public class HeapOperations {

    static class Heap{
    ArrayList<Integer> l=new ArrayList<>();
    public void add(int data){ //O(logn)
        //add at last index
        l.add(data); //O(1)

        int x=l.size()-1; //child index
        int p=(x-1)/2; //parent index

        while(l.get(x) < l.get(p)){ //O(logn)
            //swap
            int temp=l.get(x);
            l.set(x,l.get(p));
            l.set(p,temp);

            x=p; //move upward
            p=(x-1)/2;
        }
    }
    public int peek(){ //O(1)
        return l.get(0);
    }
    public void heapify(int i){
        int minIdx=i; //always min index in min heap is root
        int left=2*i+1;
        int right=2*i+2;

        if(left <  l.size() && l.get(minIdx) > l.get(left)){
            minIdx=left;
        }
        if(right <  l.size() && l.get(minIdx) > l.get(right)){
            minIdx=right;
        }

        if(minIdx != i){
            //swap
            int temp=l.get(i);
            l.set(i,l.get(minIdx));
            l.set(minIdx,temp);

            heapify(minIdx);
        }

    }
    public int remove(){ //O(logn)
        int data=l.get(0);

        //swap 1st & last element
        int temp=l.get(0);
        l.set(0,l.get(l.size()-1));
        l.set(l.size()-1,temp);

        //delete last element
        l.remove(l.size()-1);

        //Fix heap- use heapify function
        heapify(0);
        return data;
    }

    public boolean isEmpty(){
        return l.size()==0;
    }
}
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(3);
        h.add(1);
        h.add(6);
        h.add(4);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
