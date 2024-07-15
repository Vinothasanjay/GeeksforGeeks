

class Solution {
    public int DiagonalSum(int[][] matrix) {
        int n = matrix.length;
        int primarySum = 0;
        int secondarySum = 0;
        
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i]; // Summing elements from the primary diagonal
            secondarySum += matrix[i][n - 1 - i]; // Summing elements from the secondary diagonal
        }
        
        return primarySum + secondarySum; // Returning the total sum of both diagonals
    }
}
