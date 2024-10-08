class Solution:
    def ExtractNumber(self,sentence):
        l=sentence.split()
        k=[]
        for i in l:
            if i.isdigit() and '9' not in i:
                k.append(int(i))
        if k:
            return max(k)
        return -1
