class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1; int isZero = 0;
        for(int num : nums){
            if(num != 0){
                total *= num;
            }else{
                isZero++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(isZero == 1){
                if(nums[i] != 0){
                    nums[i] = 0;
                }else{
                    nums[i] = total;
                }
            }else if(isZero > 1){
                nums[i] = 0;
            }else{
                nums[i] = total/nums[i];
            }
        }
        return nums;
    }
}  
