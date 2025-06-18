import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapProgram13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 13.Find Intersection of Two Arrays with Counts.
		Input: arr1 = [1, 2, 2, 3], arr2 = [2, 2, 4] */
		int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 2, 4};

        int[] result = intersectWithCounts(arr1, arr2);

        System.out.println("Intersection with counts: " + Arrays.toString(result));
    }

    public static int[] intersectWithCounts(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                resultList.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
     }

	}


