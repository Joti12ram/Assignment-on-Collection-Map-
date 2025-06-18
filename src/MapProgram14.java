import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapProgram14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 14.Sort a Map by Its Values.
		Input: {Java=3, Python=5, C++=2} */
		Map<String, Integer> m = new HashMap<>();
        m.put("Java", 3);
        m.put("Python", 5);
        m.put("C++", 2);

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(m.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue());

        System.out.println("Map sorted by values:");
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

	}

}
