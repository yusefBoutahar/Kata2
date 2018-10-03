package histogram;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
	
	private final int[] data;

	public Histogram(int[] data) {
		this.data = data;
	}

	public int[] getData() {
		return data;
	}
	
	public Map<Integer,Integer> getHistogram() {
		Map<Integer,Integer> histogram = new HashMap<Integer, Integer>();
		
        for (int Key :data){
        	histogram.put(Key,
        			histogram.containsKey(Key) ? histogram.get(Key)+1 : 1);
        }
        return histogram;
		
	}

}
