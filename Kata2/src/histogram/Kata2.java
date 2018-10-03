package histogram;

import java.util.Map;

public class Kata2 {

	public static void main(String[] args) {
        
        Integer[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};        
        Histogram<Integer> histo = new Histogram<Integer>(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for(int key: histogr.keySet()) 
        	System.out.println(key + " ==> " + histogr.get(key));
        
	}

}
