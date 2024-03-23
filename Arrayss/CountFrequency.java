import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountFrequency {
    public static void main(String[] args) {
    int[] arr = {10,5,10,15,10,5};
    int[] arr1 = {2,2,3,4,4,2};

    Countfreq(arr);
    Countfreq(arr1);

    }

    public static void Countfreq(int[] arr){

        LinkedHashMap<Integer,Integer> freq=new LinkedHashMap<>();
        for(int i:arr){
            freq.put(i,freq.getOrDefault(i, 0)+1);
        }

        for(int i: freq.keySet()){
            System.out.println(i +"  "+ freq.get(i));
        }
    }
}
