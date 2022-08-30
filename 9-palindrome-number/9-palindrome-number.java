class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        else if(x<9) return true;
        ArrayList<Integer> list = new ArrayList<>();
        int count=0;
        while(x>0){
            int temp=x%10;
            list.add(temp);
            x/=10;
            count++;
        }
        int low=0;
        int high=count-1;
        while(low<high){
            if(list.get(low)!=list.get(high)) return false; 
            low++;
            high--;
        }
        return true;
    }
}