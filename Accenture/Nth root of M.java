class Solution
{
    public int NthRoot(int n, int m)
    {
         for(int i=1;i<=m;i++){

        double cal = Math.pow(i,n);

        if(cal == m){

            return i;

        }

        else if(cal>m){

            break;// return -1;

        }

    }

    return -1;
    }
}
//if n=2,m=9 then first it find the power upto 9 and if matches return i else -1;
