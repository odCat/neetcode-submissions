class Solution:
    def climbStairs(self, n: int, cache: Dict[int, int] = {}) -> int:
        if n < 3: return n

        if n in cache: return cache[n]

        cache[n] = self.climbStairs(n-1, cache) + self.climbStairs(n-2, cache)

        return cache[n]