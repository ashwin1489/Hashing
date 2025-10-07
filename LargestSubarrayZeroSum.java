
import java.util.*;

public class LargestSubarrayZeroSum {
    public static void main(String args[]){
        int num[]={15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer>map = new HashMap<>();
        //(sum,idx)

        int sum = 0;
        int len  = 0;

        for(int j=0;j<num.length;j++){
            sum+=num[j];
            if(map.containsKey(sum)){
                len = Math.max(len,j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
        System.out.println("largest subarray with sum as 0=>" + len);


    }
}
