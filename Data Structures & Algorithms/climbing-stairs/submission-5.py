class Solution:
    def climbStairs(self, n: int) -> int:
        if n < 3: return n

        first = 1
        second = 2
        i = 2
        while i < n:
            temp = second
            second = first + second
            first = temp
            i += 1

        return second