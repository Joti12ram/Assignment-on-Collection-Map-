import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MapProgram12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 12.Find Top K Frequent Elements.
		Input: [1, 1, 1, 2, 2, 3], k = 2 */
		int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);

        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
            new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove least frequent
            }
        }

        int[] topK = new int[k];
        int i = 0;
        while (!minHeap.isEmpty()) {
            topK[i++] = minHeap.poll().getKey();
        }

        return topK;

	}

}
