import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("keerthi",100);
        lhm.put("Anu",96);
        lhm.put("Hema",88);
        lhm.put("Ram",78);
        lhm.put("Rahul",99);

        System.out.println(lhm);
        System.out.println(lhm.get("keerthi")); //100
        System.out.println(lhm.containsKey("swetha")); //false
        System.out.println(lhm.remove("Ram")); //78
        System.out.println(lhm);

    }
}
