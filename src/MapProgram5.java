import java.util.HashMap;
import java.util.Map;

public class MapProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5.Check if a Map Contains a Key or Value.
		Input: map = {1=Java, 2=Python}, key = 2, value = "C++" */
		Map<Integer, String> m = new HashMap<>();
        m.put(1, "Java");
        m.put(2, "Python");
        int keyToCheck = 2;
        String valueToCheck = "C++";
        if (m.containsKey(keyToCheck)) {
            System.out.println("Map contains key: " + keyToCheck);
        } else {
            System.out.println("Map does not contain key: " + keyToCheck);
        }

        if (m.containsValue(valueToCheck)) {
            System.out.println("Map contains value: " + valueToCheck);
        } else {
            System.out.println("Map does not contain value: " + valueToCheck);
        }
	}

}
