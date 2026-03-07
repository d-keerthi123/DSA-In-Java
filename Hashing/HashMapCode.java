import java.util.*;

public class HashMapCode {
    public static class HashMap<K,V>{ //generics
        private class Node{
            K key;
            V value;

            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n; // ll size
        private int N; // bucket size
        private LinkedList<Node> buckets[]; //N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int hc=key.hashCode();
            //should be between 0  to size-1 of bucket
            return Math.abs(hc) % N; //returns bucket idx
        }
        private int searchInLL(K key,int bucketIdx ){
            LinkedList<Node> ll=buckets[bucketIdx];
            
            for(int i=0;i<ll.size();i++){
                Node node =ll.get(i);
                if(node.key.equals(key)){
                    return i; //dataIdx
                }
            }
            return -1; //if not found 
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[]=buckets;
            buckets= new LinkedList[N*2]; //creates a new bucket array that is double the size of the old one.
            N=2*N; //updates the variable N to reflect the new bucket size.

            //create an empty LinkedList in every bucket
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }

            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll=oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key,V value){ //O(lamda) -- which is less than the constant .So we can say its O(1)
            int bucketIdx=hashFunction(key);
            int dataIdx=searchInLL(key,bucketIdx);

            //key exits
            if(dataIdx != -1){
                Node node=buckets[bucketIdx].get(dataIdx);
                node.value=value;
            }
            else{
                buckets[bucketIdx].add(new Node(key,value));
                n++; //increment size of ll
            }
            double lamda=(double)n/N;
            if(lamda >2.0){
                rehash();
            }
        }
        public  boolean containsKey(K key){ //O(1)
            int bucketIdx=hashFunction(key);
            int dataIdx=searchInLL(key, bucketIdx);

             //key exits
            if(dataIdx != -1){
                return true;
            }

            else{
                return false;
            }
        }
        public V get(K key){ //O(1)
            int bucketIdx=hashFunction(key);
            int dataIdx=searchInLL(key, bucketIdx);

             //key exits
            if(dataIdx != -1){
                Node node=buckets[bucketIdx].get(dataIdx);
                return node.value;
            }

            else{
                return null;
            }
        }
        public V remove(K key){// O(1)
            int bucketIdx=hashFunction(key);
            int dataIdx=searchInLL(key, bucketIdx);

             //key exits
            if(dataIdx != -1){
                Node node=buckets[bucketIdx].remove(dataIdx);
                n--;
                return node.value;
            }

            else{
                return null;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys= new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll= buckets[i];
                for (Node node: ll) {
                    keys.add(node.key);
                }
            }
            return keys;
    }
    public boolean isEmpty(){
        return n==0; 
    }
}
    public static void main(String[] args) {

            HashMap<String,Integer> hm= new HashMap<>();
            hm.put("India",150);
            hm.put("China",100);
            hm.put("US",60);
            hm.put("Russia",80);

            ArrayList<String> keys=hm.keySet();
            for (String key :keys) {
               System.out.println(key); 
            }
            
            System.out.println(hm.containsKey("US")); //true
            System.out.println(hm.get("India")); //150
            System.out.println(hm.isEmpty()); //false
            System.out.println(hm.remove("China")); //100
        }
    }


