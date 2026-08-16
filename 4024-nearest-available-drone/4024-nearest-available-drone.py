class Solution:
    def nearestDrone(self, drones: list[list[int]], target: list[int]) -> int:
        tx=target[0]
        ty=target[1]
        ans=-1
        md=float("inf")
        for i in range(len(drones)):
            x,y,r=drones[i]
            cd = abs(x-tx)+abs(y-ty)
            if cd<=r and cd<md:
                    md=cd
                    ans=i

        return ans