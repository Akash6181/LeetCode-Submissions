class Solution {

    public int[] numsSameConsecDiff(int N, int K) {
        if (N == 1)
            return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> results = new ArrayList<Integer>();
        for (int num = 1; num < 10; ++num)
            this.DFS(N - 1, num, K, results);

        // convert the ArrayList to int[]
        return results.stream().mapToInt(i->i).toArray();
    }

    protected void DFS(int N, int num, int K, List<Integer> results) {
        if (N == 0) {
            results.add(num);
            return;
        }
        List<Integer> nextDigits = new ArrayList<>();

        Integer tailDigit = num % 10;
        nextDigits.add(tailDigit + K);
        if (K != 0)
            nextDigits.add(tailDigit - K);
        for (Integer nextDigit : nextDigits) {
            if (0 <= nextDigit && nextDigit < 10) {
                Integer newNum = num * 10 + nextDigit;
                this.DFS(N - 1, newNum, K, results);
            }
        }
    }
}
// class Solution {
//     public int[] numsSameConsecDiff(int n, int k) {
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i=(int)Math.pow(10,n-1);i<(int)Math.pow(10,n);i++){
//             if(sameDiff(i,k)) list.add(i);
//         }
//         int[] arr = new int[list.size()];
//         for(int i=0;i<list.size();i++){
//             arr[i]=list.get(i);
//         }
//         return arr;
//     }
//     public boolean sameDiff(int n,int k){
//         boolean b = true;
//         int first=0,second=0,diff=0;
//         while(n>=10){
//             first = n%10;
//             n/=10;
//             second = n%10;
//             diff = Math.abs(first-second);
//             if(diff!=k) {
//                 b = false;
//                 break;
//             }
//         }
//         return b;
//     }
// }