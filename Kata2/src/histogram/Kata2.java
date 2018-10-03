package histogram;

import java.util.Map;

public class Kata2 {

	public static void main(String[] args) {
        
        String[] data = {"Pedro","yusef","maria","yusef","Hassan",};        
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        
        for(String key: histogr.keySet()) 
        	System.out.println(key + " ==> " + histogr.get(key));
        
	}

}
