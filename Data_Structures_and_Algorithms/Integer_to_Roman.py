class Solution:
    def intToRoman(self, num: int) -> str:
        numbers = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        letters = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]

        result = ""
        index = 0
        for x in numbers:
            while x <= num:
                result += letters[index]
                num -= x
            index += 1
        
        return result
