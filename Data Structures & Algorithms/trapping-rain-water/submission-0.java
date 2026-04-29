class Solution {
    public int trap(int[] height) {
        int i=0; int j=height.length-1; int water = 0; int leftmax=0; int rightmax=0;
        while(i<j){
            if(height[i]<height[j]){
                if(height[i]>leftmax){
                    leftmax = height[i];
                }
                water += leftmax - height[i]; i++;
            }else{
                if(height[j]>rightmax){
                    rightmax = height[j];
                }
                water += rightmax - height[j]; j--;
            }
        }
        return water;
    }
}
