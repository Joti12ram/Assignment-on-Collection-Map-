import java.util.HashMap;
import java.util.Map;

public class MapProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4.Count Word Occurrences in a Sentence.
		Input: "java is awesome and java is powerful" */
		String input = "java is awesome and java is powerful";

        Map<String, Integer> wordCounts = new HashMap<>();
        String[] words = input.toLowerCase().split(" ");

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
	}

}
