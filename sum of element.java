class Solution {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        int sum=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                sum=sum+Grid[i][j];
            }
        }
        return sum;
    }
}
