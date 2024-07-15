import java.util.Map.Entry;
class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        // Frequency map to count the occurrences of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }


        PriorityQueue<Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue()
        );

        // Iterate through the frequency map
        for (Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Extract the top k frequent elements from the min-heap
        int[] topKElements = new int[k];
        int index = 0;
        while (!minHeap.isEmpty()) {
            topKElements[index++] = minHeap.poll().getKey();
        }

        return topKElements;
    }
}