class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int l=0,r=height.length-1;
        while(l<r){
            int ht=Math.min(height[l],height[r]);
            max=Math.max(max,(r-l)*ht);
            while(l<r && height[l]<=ht) l++;
            // else    r--;
            while(l<r && height[r]<=ht) r--;
        }
        return max;
    }
}