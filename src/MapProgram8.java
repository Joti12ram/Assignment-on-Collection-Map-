import java.util.HashMap;
import java.util.Map;

public class MapProgram8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 8.Merge Two Maps.
		Input: map1 = {1="A"}, map2 = {2="B"} */
		Map<Integer, String> m1 = new HashMap<>();
        m1.put(1, "A");

        Map<Integer, String> m2 = new HashMap<>();
        m2.put(2, "B");

        m1.putAll(m2);

        System.out.println("Merged Map: " + m1);
	}

}
