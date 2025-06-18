import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapProgram11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 11.Group Anagrams Using HashMap.
		Input: ["bat", "tab", "tap", "pat", "cat", "act"] */
		String[] str = {"bat", "tab", "tap", "pat", "cat", "act"};

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : str) {
           
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        System.out.println("Grouped Anagrams:");
        for (List<String> group : anagramMap.values()) {
            System.out.println(group);
        }

	}

}
