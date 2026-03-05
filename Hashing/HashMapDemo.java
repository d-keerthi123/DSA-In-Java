import java.util.HashMap;

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

        System.out.println(hm.get("tea"));
        System.out.println(hm.containsKey("samosa"));

        //remove operation
        hm.remove("samosa");
        System.out.println(hm);
        
    }
}
