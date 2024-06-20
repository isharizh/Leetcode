
class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] res = new int[queries.length];
        
        // Step 1: Identify the positions of all candles
        List<Integer> candlePositions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '|') {
                candlePositions.add(i);
            }
        }

        // Step 2: Create a prefix sum array for plates
        int[] prefixSum = new int[n];
        int plates = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '*') {
                plates++;
            }
            prefixSum[i] = plates;
        }

        // Step 3: Process each query
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            
            // Use binary search to find the leftmost and rightmost candles within the range
            int leftCandle = Collections.binarySearch(candlePositions, left);
            int rightCandle = Collections.binarySearch(candlePositions, right);
            
            if (leftCandle < 0) leftCandle = -leftCandle - 1;
            if (rightCandle < 0) rightCandle = -rightCandle - 2;
            
            if (leftCandle < candlePositions.size() && rightCandle >= 0 && candlePositions.get(leftCandle) <= candlePositions.get(rightCandle)) {
                int l = candlePositions.get(leftCandle);
                int r = candlePositions.get(rightCandle);
                res[i] = prefixSum[r] - prefixSum[l];
            } else {
                res[i] = 0;
            }
        }
        
        return res;
    }
}
