class Solution:
    def minPenalty(self, period: int, lights: list[int], arrivalTime: list[int]) -> int:
        ml=max(lights)
        p=0

        for t in arrivalTime:
            r=t%period
            if r>=ml:
                p=max(p,period-r)
        return p