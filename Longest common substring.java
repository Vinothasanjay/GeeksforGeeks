class Solution {
    public int longestCommonSubstr(String str1, String str2) {
        int n=str1.length()+1;
        int m=str2.length()+1;
        int[][] arr=new int[n][m];
        int longest=0;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                    longest=Math.max(longest,arr[i][j]);
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        return longest;
    }
}
