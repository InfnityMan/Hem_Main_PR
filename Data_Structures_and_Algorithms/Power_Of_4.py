class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if n <= 0: return False
        n = math.log(n,4)
        return n == round(n)
