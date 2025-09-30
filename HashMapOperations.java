import java.util.*;

public class HashMapOperations{
    public static void main(String args[]) {
        System.out.println("Hello let's start with java");
        //create
        HashMap<String,Integer>hm = new HashMap<>();
        //Insert-->O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Us",50);

        System.out.println(hm);

        //get-->O(1)
        int population = hm.get("China");
        System.out.println(population);

        System.out.println(hm.get("france"));
        //containsKey-->O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indiana"));

        //Remove-->O(1)
        System.out.println(hm.remove("India"));
        System.out.println(hm);

        //Size(
        System.out.println(hm.size());

        //Is Empty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm);

    }
}
