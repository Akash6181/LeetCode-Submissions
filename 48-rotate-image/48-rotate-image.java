class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] temp = new int[n][n];
        int i=0;
        int j=n-1;
        while(j>=0 &&i<n){
            for(int k=0;k<n;k++){
                temp[k][j]=matrix[i][k];
            }
            j--;
            i++;
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                matrix[i][j]=temp[i][j];
            }
        }
    }
}