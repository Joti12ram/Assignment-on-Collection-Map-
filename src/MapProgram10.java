import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapProgram10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 10.Remove All Entries with a Specific Value.
		Input: map = {1="a", 2="b", 3="a"}, value = "a" */
		 Map<Integer, String> m = new HashMap<>();
	        m.put(1, "a");
	        m.put(2, "b");
	        m.put(3, "a");

	        String valueToRemove = "a";

	        Iterator<Map.Entry<Integer, String>> iterator = m.entrySet().iterator();
	        while (iterator.hasNext()) {
	            Map.Entry<Integer, String> entry = iterator.next();
	            if (entry.getValue().equals(valueToRemove)) {
	                iterator.remove();
	            }
	        }

	        System.out.println("Updated Map: " + m);
	}

}
