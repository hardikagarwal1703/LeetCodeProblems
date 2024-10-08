class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int i = 0;
        int j = n-1;
        int maxWater = 0; 

        while(i<j){
            int tempWater = Math.min(height[i], height[j]) * (j - i);   // l*b l=Math.min(height[i], height[j])
            maxWater = Math.max(maxWater,tempWater);
            if (height[i] < height[j]) {
                ++i;
            } else {
                --j;
            }
        }
        return maxWater;
    }
}