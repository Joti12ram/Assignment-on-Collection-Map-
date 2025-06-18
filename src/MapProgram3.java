import java.util.LinkedHashMap;
import java.util.Map;

public class MapProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3.Find First Non-Repeating Character in a String.
		Input: "aabbcddex */
		String input = "aabbcddex";
        Character result = findFirstNonRepeatingChar(input);

        if (result != null) {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static Character findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
	}

}
