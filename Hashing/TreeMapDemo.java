import java.util.TreeMap;
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("keerthi",100);
        tm.put("Anu",96);
        tm.put("Hema",88);
        tm.put("Ram",78);
        tm.put("Rahul",99);

        System.out.println(tm);
        System.out.println(tm.get("keerthi")); //100
        System.out.println(tm.containsKey("swetha")); //false
        System.out.println(tm.remove("Ram")); //78
        System.out.println(tm);

    }
}
