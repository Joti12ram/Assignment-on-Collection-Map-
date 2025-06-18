import java.util.HashMap;
import java.util.Map;

public class MapProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6.Iterate Through a Map.
		Input: map = {1="A", 2="B", 3="C"} */
		Map<Integer, String> m = new HashMap<>();
        m.put(1, "A");
        m.put(2, "B");
        m.put(3, "C");

        System.out.println("Iterating using entrySet():");
        for (Map.Entry<Integer, String> entry : m.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("Only keys:");
        for (Integer key : m.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nOnly values:");
        for (String value : m.values()) {
            System.out.println(value);
        }
	}

}
