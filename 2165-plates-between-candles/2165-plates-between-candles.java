class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int[] fright = new int[s.length()];
        int[] fleft = new int[s.length()];
        char[] arr = s.toCharArray();
        int candles = -1;
        int stars = 0;
        int[] starCount = new int[s.length()];
        for(int i = 0; i < arr.length; i++){
            char c = arr[i];
            if(c == '*')
                stars++;
            if(c == '|')
                candles = i;
            fleft[i] = candles;
            starCount[i] = stars;
        }
        candles = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            char c = arr[i];
            if(c == '|')
                candles = i;
            fright[i] = candles;
        }
        int[] result= new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int leftWall = fright[queries[i][0]];
            int rightWall = fleft[queries[i][1]];
            if(leftWall == -1 || rightWall == -1 || leftWall >= rightWall){
                result[i] = 0;
                continue;
            }
            result[i] = starCount[rightWall] - starCount[leftWall];
        }
        return result;
    }
}