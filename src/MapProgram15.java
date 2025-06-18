import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapProgram15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 15.Take User Input to Populate a Map and Print It.
	Input: User enters 3 key-value pairs → (1, "A"), (2, "B"), (3, "C") */
		 Scanner sc = new Scanner(System.in);
	        Map<Integer, String> map = new HashMap<>();

	        System.out.println("Enter 3 key-value pairs (e.g., 1 A):");

	        for (int i = 0; i < 3; i++) {
	            System.out.print("Enter key (int): ");
	            int key = sc.nextInt();
	            System.out.print("Enter value (String): ");
	            String value = sc.next();  
	            map.put(key, value);
	        }

	        sc.close();
	        // Print the map
	        System.out.println("Map contents:");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " = " + entry.getValue());
	        }
	}

}
