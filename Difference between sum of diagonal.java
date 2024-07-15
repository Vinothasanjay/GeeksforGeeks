
class Solution {
    int diagonalSumDifference(int N, int[][] Grid) {
        int n = Grid.length;
        int primarySum = 0;
        int secondarySum = 0;
        
        for (int i = 0; i < n; i++) {
            primarySum += Grid[i][i]; // Summing elements from the primary diagonal
            secondarySum += Grid[i][n - 1 - i]; // Summing elements from the secondary diagonal
        }
        int n1=primarySum - secondarySum;
        if(n1<0){
            return n1*-1;
        }
        else{
        
        return n1 ; // Returning the total sum of both diagonals
    }
}
}
