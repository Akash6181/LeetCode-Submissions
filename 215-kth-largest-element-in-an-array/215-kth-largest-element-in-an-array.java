class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            max.offer(nums[i]);
        }
        int out=-1;
        for(int i=0;i<k;i++){
            out=max.poll();
        }
        return out;
    }
}