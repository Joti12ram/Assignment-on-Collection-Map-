import java.util.HashMap;
import java.util.Map;

public class MapProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 7.Swap Keys and Values in a Map.
		Input: {1="a", 2="b", 3="c"} */
		Map<Integer, String> org_map = new HashMap<>();
		 org_map.put(1, "a");
		 org_map.put(2, "b");
		 org_map.put(3, "c");

	        Map<String, Integer> swappedMap = new HashMap<>();

	        for (Map.Entry<Integer, String> entry : org_map.entrySet()) {
	            swappedMap.put(entry.getValue(), entry.getKey());
	        }

	        System.out.println("Swapped Map: " + swappedMap);
	}

}
