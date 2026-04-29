class Solution {
    public int maxArea(int[] heights) {
        int i=0; int j=heights.length-1; int max = 0; int curr = 0;
        while(i<j){
            curr = Math.min(heights[i],heights[j])*(j-i);
            max = Math.max(curr,max);
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
    return max;
    }
}
