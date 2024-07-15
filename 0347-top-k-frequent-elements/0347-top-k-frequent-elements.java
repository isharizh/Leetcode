class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] buckets = new int[20001];
        int lb = 10000;
        for (var n : nums) {
            buckets[lb+n]++;
        }

        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>(k, (e1,e2) -> e1.getValue().compareTo(e2.getValue()));
        for (int i = 0; i < buckets.length; i++) {
            var count = buckets[i];
            if (count == 0) {
                continue;
            }
            var num = i - lb;
            if (queue.size() < k) {
                queue.add(Map.entry(num, count));
            } else if (queue.peek().getValue() < count) {
                queue.remove();
                queue.add(Map.entry(num, count));
            }
        }

        int[] res = new int[k];
        int c = 0;
        for (var entry : queue) {
            res[c++] = entry.getKey();
        }        
        return res;
    }
}