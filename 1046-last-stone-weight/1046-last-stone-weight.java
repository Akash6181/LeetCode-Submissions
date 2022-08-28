class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            max.offer(stones[i]);
        }
        int a=0;
        int b=0;
        while(max.size()>0){
            if(max.size()==1) return max.peek();
            a=max.poll();
            b=max.poll();
            if(a>b) max.offer(a-b);
        }
        return 0;
    }
}