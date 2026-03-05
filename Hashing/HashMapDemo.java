import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm=new HashMap<>();

        //add operation O(1)
        //Menu
        hm.put("samosa",20);
        hm.put("tea",10);
        hm.put("coffee",30);
        hm.put("pav bhaji",50);
        System.out.println(hm);

        //get O(1)
        System.out.println(hm.get("tea"));
        System.out.println(hm.get("fried rice")); //key doesn't  exist - returns null

        //containsKey O(1)
        System.out.println(hm.containsKey("samosa")); // key exits-true
        System.out.println(hm.containsKey("noodles"));//key doesn't exist - false

        //remove operation O(1)
        System.out.println(hm.remove("samosa")); //return key's value
        System.out.println(hm);

        //size
        System.out.println(hm.size());
        //is empty 
        //hm.clear(); //clears entire hashmap 
        System.out.println(hm.isEmpty());

        //iteration on hash map
        //keys
        Set<String> keys=hm.keySet();
        for (String k : keys) {
            System.out.println("key "+ k +" "+ "value : "+hm.get(k));
        }
        //values
        Collection<Integer> val=hm.values();
        for (int  v : val) {
            System.out.println(v);
        }

        //key+ value
        Set<Map.Entry<String,Integer>> pair=hm.entrySet();
        for (Map.Entry<String,Integer> entry:pair) {
            System.out.println("key: " +entry.getKey()+ " "+ "value: "+entry.getValue());
           
        }
    }
}
