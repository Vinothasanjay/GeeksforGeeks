class Compute
{
    String average(int A[], int N)
    {
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
        }
        double Avg=(double)sum/N;
        return String.format("%.2f",Avg);
    }
}
