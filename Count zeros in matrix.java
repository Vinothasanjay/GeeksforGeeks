
class GfG
{
    /*you are required to complete this method*/
    int countZeros(int A[][], int N)
    {
        int c=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(A[i][j]==0){
                    c=c+1;
                }
            }
        }
        return c;
    }
}
