import java.util.HashMap;
import java.util.Map;

public class MapProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 9.Get Value with Default if Key Not Present.
		Input: map = {1="Java"}, key = 2, default = "Unknown" */
		Map<Integer, String> m = new HashMap<>();
        m.put(1, "Java");

        int keyToFind = 2;
        String defaultValue = "Unknown";

        String result = m.getOrDefault(keyToFind, defaultValue);

        System.out.println("Value: " + result);
	}

}
