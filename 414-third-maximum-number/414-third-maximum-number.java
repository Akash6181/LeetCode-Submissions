class Solution {
    public int thirdMax(int[] nums) {
        long max = nums[0];
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max3=max2;
                max2=max;
                max=nums[i];
            }
            else if(nums[i]<max && nums[i]>max2){
                max3=max2;
                max2=nums[i];
            }
            else if(nums[i]<max2 && nums[i]>max3){
                max3=nums[i];
            }
        }
        if(max3==Long.MIN_VALUE) return (int)max;
        else return (int)max3;
    }
}

