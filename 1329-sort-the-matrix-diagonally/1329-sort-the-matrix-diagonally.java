class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int diff = n-1;
        int totaldiag = n+m-1;
        for(int i=0;i<totaldiag;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<n;j++){
                for(int k=0;k<m;k++){
                    if((j-k)==diff){
                        temp.add(mat[j][k]);
                        break;
                    }
                }
            }
            Collections.sort(temp);
            int index=0;
            for(int j=0;j<n;j++){
                for(int k=0;k<m;k++){
                    if((j-k)==diff){
                        mat[j][k]=temp.get(index++);
                        break;
                    }
                }
            }
            diff--;
        }
        return mat;
    }
}