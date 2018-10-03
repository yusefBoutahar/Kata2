package histogram;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

	public static void main(String[] args) {
        
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};        
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>(); 
        

        for (int Key :data){
        	histogram.put(Key,
        			histogram.containsKey(Key) ? histogram.get(Key)+1 : 1);
        }
        
        for(int key: histogram.keySet()) System.out.println(key + " ==> " + histogram.get(key));

	}

}
