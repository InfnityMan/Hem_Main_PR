class Solution:
	def lengthOfLastWord(self, s: str) -> int:
  	i,l=len(s),0
		while i>0:
			i-=1
			if s[i]!=" ":l+=1
			elif l>0:return l
		return l
