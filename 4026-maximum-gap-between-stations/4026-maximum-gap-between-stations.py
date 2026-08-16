class Solution:
    def maximumGap(self, skill: str, station: str) -> int:
        n,m = len(skill),len(station)

        if n==1:
            return 0

        e=[0]*n
        p=0
        for i in range(n):
            while station[p]!=skill[i]:
                p+=1
            e[i]=p
            p+=1

        l=[0]*n
        p=m-1
        for i in range(n-1,-1,-1):
            while station[p] !=skill[i]:
                p-=1
            l[i]=p
            p-=1

        ans=0
        for i in range(1,n):
            ans=max(ans,l[i]-e[i-1])
        return ans