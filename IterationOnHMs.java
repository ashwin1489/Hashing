import java.util.*;
public class IterationOnHMs{
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Us",50);
        hm.put("Indonesia",6);
        hm.put("Nepal",5);

        //Iterate
        Set<String>Keys = hm.keySet();
        System.out.println(Keys);

        for(String K:Keys){
            System.out.println("Key= "+ K +" ,value=" +hm.get(K));
        }

    }
   
    

}