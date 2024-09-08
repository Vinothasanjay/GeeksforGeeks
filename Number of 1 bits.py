
class Solution:
	def setBits(self, n):
		d=bin(n)
		c=0
		for i in d:
		    if i=='1':
		        c=c+1
		return c
    # java

int setBits=0;
        
while(N>0)
{
    N=N&(N-1);
    setBits++;
}

    return setBits;
